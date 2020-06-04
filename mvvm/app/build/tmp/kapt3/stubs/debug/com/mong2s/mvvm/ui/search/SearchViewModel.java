package com.mong2s.mvvm.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00118BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/mong2s/mvvm/ui/search/SearchViewModel;", "Lcom/mong2s/mvvm/BaseViewModel;", "api", "Lcom/mong2s/mvvm/data/remote/api/SearchAPI;", "dao", "Lcom/mong2s/mvvm/data/db/dao/BookmarkDao;", "(Lcom/mong2s/mvvm/data/remote/api/SearchAPI;Lcom/mong2s/mvvm/data/db/dao/BookmarkDao;)V", "_items", "Lcom/mong2s/mvvm/util/NotNullMutableLiveData;", "", "Lcom/mong2s/mvvm/data/remote/domain/Repository;", "_refreshing", "", "items", "getItems", "()Lcom/mong2s/mvvm/util/NotNullMutableLiveData;", "query", "", "getQuery", "()Ljava/lang/String;", "refreshing", "getRefreshing", "doSearch", "", "onQueryChange", "", "saveToBookmark", "repository", "app_debug"})
public final class SearchViewModel extends com.mong2s.mvvm.BaseViewModel {
    private java.lang.String query = "";
    private final com.mong2s.mvvm.util.NotNullMutableLiveData<java.lang.Boolean> _refreshing = null;
    private final com.mong2s.mvvm.util.NotNullMutableLiveData<java.util.List<com.mong2s.mvvm.data.remote.domain.Repository>> _items = null;
    private final com.mong2s.mvvm.data.remote.api.SearchAPI api = null;
    private final com.mong2s.mvvm.data.db.dao.BookmarkDao dao = null;
    
    private final java.lang.String getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mong2s.mvvm.util.NotNullMutableLiveData<java.lang.Boolean> getRefreshing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mong2s.mvvm.util.NotNullMutableLiveData<java.util.List<com.mong2s.mvvm.data.remote.domain.Repository>> getItems() {
        return null;
    }
    
    public final void doSearch() {
    }
    
    public final void onQueryChange(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence query) {
    }
    
    public final void saveToBookmark(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.data.remote.domain.Repository repository) {
    }
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.data.remote.api.SearchAPI api, @org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.data.db.dao.BookmarkDao dao) {
        super();
    }
}