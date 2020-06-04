package com.mong2s.mvvm.ui.bookmark

import android.os.Bundle
import androidx.annotation.LayoutRes
import com.mong2s.mvvm.BindingActivity
import com.mong2s.mvvm.R
import com.mong2s.mvvm.databinding.ActivityBookmarkBinding
import org.koin.androidx.viewmodel.ext.android.getViewModel

class BookMarkActivity : BindingActivity<ActivityBookmarkBinding>() {

    @LayoutRes
    override fun getLayoutResId() = R.layout.activity_bookmark

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vm = getViewModel()
        binding.setLifecycleOwner(this)
    }
}
