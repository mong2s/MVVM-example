package com.mong2s.mvvm.ui.search

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.LayoutRes
import com.mong2s.mvvm.BindingActivity
import com.mong2s.mvvm.R
import com.mong2s.mvvm.databinding.ActivitySearchBinding
import com.mong2s.mvvm.ui.bookmark.BookMarkActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel

class SearchActivity : BindingActivity<ActivitySearchBinding>() {
    @LayoutRes
    override fun getLayoutResId() = R.layout.activity_search

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vm = getViewModel()
        binding.setLifecycleOwner(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_search, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.bookmark -> {
                startActivity(Intent(this, BookMarkActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}