package com.mong2s.mvvm.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/mong2s/mvvm/data/db/dao/BookmarkDao;", "", "delete", "", "bookmark", "Lcom/mong2s/mvvm/data/db/entry/Bookmark;", "findAll", "Landroidx/paging/DataSource$Factory;", "", "insert", "app_debug"})
public abstract interface BookmarkDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Bookmark ORDER BY created ASC")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.mong2s.mvvm.data.db.entry.Bookmark> findAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.data.db.entry.Bookmark bookmark);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.mong2s.mvvm.data.db.entry.Bookmark bookmark);
}