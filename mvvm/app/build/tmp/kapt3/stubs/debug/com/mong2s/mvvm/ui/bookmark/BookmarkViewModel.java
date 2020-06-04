package com.mong2s.mvvm.ui.bookmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/mong2s/mvvm/ui/bookmark/BookmarkViewModel;", "Lcom/mong2s/mvvm/BaseViewModel;", "dao", "Lcom/mong2s/mvvm/data/db/dao/BookmarkDao;", "(Lcom/mong2s/mvvm/data/db/dao/BookmarkDao;)V", "items", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/mong2s/mvvm/data/db/entry/Bookmark;", "getItems", "()Landroidx/lifecycle/LiveData;", "delete", "", "bookmark", "app_debug"})
public final class BookmarkViewModel extends com.mong2s.mvvm.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.mong2s.mvvm.data.db.entry.Bookmark>> items = null;
    private final com.mong2s.mvvm.data.db.dao.BookmarkDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.mong2s.mvvm.data.db.entry.Bookmark>> getItems() {
        return null;
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.data.db.entry.Bookmark bookmark) {
    }
    
    public BookmarkViewModel(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.data.db.dao.BookmarkDao dao) {
        super();
    }
}