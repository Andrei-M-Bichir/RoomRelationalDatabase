package com.andrei_bch.roomrelationaldatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.andrei_bch.roomrelationaldatabase.entities.Director
import com.andrei_bch.roomrelationaldatabase.entities.School

data class SchoolAndDirector(
    @Embedded
    val school: School,
    @Relation(
        parentColumn = "schoolName",   //Parent is the first entity in the name
        entityColumn = "schoolName"
    )
    val director: Director
)