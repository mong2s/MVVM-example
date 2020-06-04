package com.mong2s.mvvm.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001d\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/mong2s/mvvm/ui/search/RepositoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mong2s/mvvm/ui/search/RepositoryAdapter$RepositoryViewHolder;", "items", "", "Lcom/mong2s/mvvm/data/remote/domain/Repository;", "vm", "Lcom/mong2s/mvvm/ui/search/SearchViewModel;", "(Ljava/util/List;Lcom/mong2s/mvvm/ui/search/SearchViewModel;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getVm", "()Lcom/mong2s/mvvm/ui/search/SearchViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RepositoryViewHolder", "app_debug"})
public final class RepositoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mong2s.mvvm.ui.search.RepositoryAdapter.RepositoryViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.mong2s.mvvm.data.remote.domain.Repository> items;
    @org.jetbrains.annotations.NotNull()
    private final com.mong2s.mvvm.ui.search.SearchViewModel vm = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mong2s.mvvm.ui.search.RepositoryAdapter.RepositoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.ui.search.RepositoryAdapter.RepositoryViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mong2s.mvvm.data.remote.domain.Repository> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mong2s.mvvm.data.remote.domain.Repository> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mong2s.mvvm.ui.search.SearchViewModel getVm() {
        return null;
    }
    
    public RepositoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mong2s.mvvm.data.remote.domain.Repository> items, @org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.ui.search.SearchViewModel vm) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/mong2s/mvvm/ui/search/RepositoryAdapter$RepositoryViewHolder;", "Lcom/mong2s/mvvm/BindingViewHolder;", "Lcom/mong2s/mvvm/databinding/ItemRepositoryBinding;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class RepositoryViewHolder extends com.mong2s.mvvm.BindingViewHolder<com.mong2s.mvvm.databinding.ItemRepositoryBinding> {
        
        public RepositoryViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}