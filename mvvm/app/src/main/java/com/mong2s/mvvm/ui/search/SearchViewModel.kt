package com.mong2s.mvvm.ui.search

import com.mong2s.mvvm.BaseViewModel
import com.mong2s.mvvm.data.remote.api.SearchAPI
import com.mong2s.mvvm.data.db.dao.BookmarkDao
import com.mong2s.mvvm.data.db.entry.Bookmark
import com.mong2s.mvvm.data.remote.domain.Repository
import com.mong2s.mvvm.util.NotNullMutableLiveData
import com.mong2s.mvvm.util.ioThread

class SearchViewModel(private val api: SearchAPI, private val dao: BookmarkDao) : BaseViewModel() {
    private var query: String = ""
        get() = if (field.isEmpty()) "MVVM" else field

    private val _refreshing: NotNullMutableLiveData<Boolean> = NotNullMutableLiveData(false)
    val refreshing: NotNullMutableLiveData<Boolean>
        get() = _refreshing

    private val _items: NotNullMutableLiveData<List<Repository>> = NotNullMutableLiveData(arrayListOf())
    val items: NotNullMutableLiveData<List<Repository>>
        get() = _items

    fun doSearch() {
        val params = mutableMapOf<String, String>().apply {
            this["q"] = query
            this["sort"] = "stars"
        }

        addToDisposable(api.search(params)
            .doOnSubscribe { _refreshing.value = true }
            .doOnSuccess { _refreshing.value = false }
            .doOnError { _refreshing.value = false }
            .subscribe({
                _items.value = it.repositories
            }, {
                // handle errors
            }))
    }

    fun onQueryChange(query: CharSequence) {
        this.query = query.toString()
    }

    fun saveToBookmark(repository: Repository) = ioThread { dao.insert(Bookmark.to(repository)) }
}