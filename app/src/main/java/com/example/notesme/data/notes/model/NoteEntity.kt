package com.example.notesme.data.notes.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notesme.utils.Constants

@Entity(tableName = Constants.note_table_name)
data class NoteEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "title") val firstName: String?,
    @ColumnInfo(name = "body") val lastName: String?
)
