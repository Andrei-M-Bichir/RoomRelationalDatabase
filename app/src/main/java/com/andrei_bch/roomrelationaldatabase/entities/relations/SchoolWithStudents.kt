package com.andrei_bch.roomrelationaldatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.andrei_bch.roomrelationaldatabase.entities.School
import com.andrei_bch.roomrelationaldatabase.entities.Student

data class SchoolWithStudents(
    @Embedded
    val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)