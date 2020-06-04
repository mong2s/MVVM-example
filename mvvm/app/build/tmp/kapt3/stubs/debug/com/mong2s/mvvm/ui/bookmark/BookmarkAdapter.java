package com.mong2s.mvvm.ui.bookmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/mong2s/mvvm/ui/bookmark/BookmarkAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/mong2s/mvvm/data/db/entry/Bookmark;", "Lcom/mong2s/mvvm/ui/bookmark/BookmarkAdapter$BookmarkViewHolder;", "vm", "Lcom/mong2s/mvvm/ui/bookmark/BookmarkViewModel;", "(Lcom/mong2s/mvvm/ui/bookmark/BookmarkViewModel;)V", "getVm", "()Lcom/mong2s/mvvm/ui/bookmark/BookmarkViewModel;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookmarkViewHolder", "Companion", "app_debug"})
public final class BookmarkAdapter extends androidx.paging.PagedListAdapter<com.mong2s.mvvm.data.db.entry.Bookmark, com.mong2s.mvvm.ui.bookmark.BookmarkAdapter.BookmarkViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.mong2s.mvvm.ui.bookmark.BookmarkViewModel vm = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.mong2s.mvvm.data.db.entry.Bookmark> DIFF_CALLBACK = null;
    public static final com.mong2s.mvvm.ui.bookmark.BookmarkAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mong2s.mvvm.ui.bookmark.BookmarkAdapter.BookmarkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.ui.bookmark.BookmarkAdapter.BookmarkViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mong2s.mvvm.ui.bookmark.BookmarkViewModel getVm() {
        return null;
    }
    
    public BookmarkAdapter(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.ui.bookmark.BookmarkViewModel vm) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/mong2s/mvvm/ui/bookmark/BookmarkAdapter$BookmarkViewHolder;", "Lcom/mong2s/mvvm/BindingViewHolder;", "Lcom/mong2s/mvvm/databinding/ItemBookmarkBinding;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class BookmarkViewHolder extends com.mong2s.mvvm.BindingViewHolder<com.mong2s.mvvm.databinding.ItemBookmarkBinding> {
        
        public BookmarkViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/mong2s/mvvm/ui/bookmark/BookmarkAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/mong2s/mvvm/data/db/entry/Bookmark;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}