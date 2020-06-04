package com.mong2s.mvvm.data.db.dao

import androidx.room.*
import com.mong2s.mvvm.data.db.entry.Bookmark
import androidx.paging.DataSource

@Dao
interface BookmarkDao {

    @Query("SELECT * FROM Bookmark ORDER BY created ASC")
    fun findAll(): DataSource.Factory<Int, Bookmark>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(bookmark: Bookmark)

    @Delete
    fun delete(bookmark: Bookmark)

}