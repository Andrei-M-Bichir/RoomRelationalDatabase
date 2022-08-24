package com.andrei_bch.roomrelationaldatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.andrei_bch.roomrelationaldatabase.entities.Student
import com.andrei_bch.roomrelationaldatabase.entities.Subject

data class StudentWithSubjects(
    @Embedded
    val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
