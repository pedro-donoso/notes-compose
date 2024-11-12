package com.example.notesme.data.notes

import com.example.notesme.data.notes.local.NoteDao
import com.example.notesme.data.notes.model.NoteEntity
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val noteDao: NoteDao
) {
    fun getAllNotes(): List<NoteEntity> {
        return noteDao.getAll()
    }

    fun insertNote(noteEntity: NoteEntity) {
        noteDao.insertAll(noteEntity = noteEntity)
    }

    fun updateNote(noteEntity: NoteEntity) {
        noteDao.update(noteEntity = noteEntity)
    }

    fun deleteNote(noteEntity: NoteEntity) {
        noteDao.delete(noteEntity = noteEntity)
    }
}