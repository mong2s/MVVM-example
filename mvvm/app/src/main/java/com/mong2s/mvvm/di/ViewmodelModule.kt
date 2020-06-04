package com.mong2s.mvvm.di

import com.mong2s.mvvm.ui.bookmark.BookmarkViewModel
import com.mong2s.mvvm.ui.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SearchViewModel(get(), get()) }
    viewModel { BookmarkViewModel(get()) }
}