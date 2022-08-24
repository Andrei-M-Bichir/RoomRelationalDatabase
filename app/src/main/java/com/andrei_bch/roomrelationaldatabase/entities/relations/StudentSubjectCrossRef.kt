package com.andrei_bch.roomrelationaldatabase.entities.relations

import androidx.room.Entity

// the primary key of this table/entity is the combination of the 2 primary keys of each table contained(student and subject
@Entity(primaryKeys = ["studentName", "subjectName"])
data class StudentSubjectCrossRef(
    val studentName: String,
    val subjectName: String
){

}
