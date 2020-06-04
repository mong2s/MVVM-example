package com.mong2s.mvvm.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.mong2s.mvvm.BaseViewModel
import com.mong2s.mvvm.data.db.dao.BookmarkDao
import com.mong2s.mvvm.data.db.entry.Bookmark
import com.mong2s.mvvm.util.ioThread

class BookmarkViewModel(private val dao: BookmarkDao) : BaseViewModel() {
    val items: LiveData<PagedList<Bookmark>> = LivePagedListBuilder(dao.findAll(),  /* page size */ 10).build()
    fun delete(bookmark: Bookmark) = ioThread { dao.delete(bookmark) }
}