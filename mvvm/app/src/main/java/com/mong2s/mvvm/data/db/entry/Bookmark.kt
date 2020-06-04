package com.mong2s.mvvm.data.db.entry

import androidx.room.*
import com.mong2s.mvvm.data.remote.domain.Repository
import java.util.*

@Entity(tableName = "Bookmark")
@TypeConverters(DateConverter::class)
data class Bookmark(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "language") val language: String?,
    @ColumnInfo(name = "stargazers_count") val stargazersCount: Int,
    @ColumnInfo(name = "created") val created: Date
) {
    companion object {
        fun to(repository: Repository): Bookmark {
            return Bookmark(
                name = repository.name,
                description = repository.description,
                language = repository.language,
                stargazersCount = repository.stargazersCount,
                created = Date()
            )
        }
    }
}

class DateConverter {
    @TypeConverter
    fun toDate(value: Long): Date = Date(value)

    @TypeConverter
    fun toLong(date: Date): Long = date.time
}