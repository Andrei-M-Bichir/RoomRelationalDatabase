package com.andrei_bch.roomrelationaldatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.andrei_bch.roomrelationaldatabase.entities.Student
import com.andrei_bch.roomrelationaldatabase.entities.Subject

data class SubjectWithStudents(
    @Embedded
    val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)