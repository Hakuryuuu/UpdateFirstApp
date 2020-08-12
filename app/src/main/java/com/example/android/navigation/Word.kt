package com.example.android.navigation

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//สร้าง Entity โดยเพิ่ม Data class และ Entity

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)
