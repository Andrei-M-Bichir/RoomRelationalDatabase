package com.andrei_bch.roomrelationaldatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Transaction
import com.andrei_bch.roomrelationaldatabase.entities.Director
import com.andrei_bch.roomrelationaldatabase.entities.School
import com.andrei_bch.roomrelationaldatabase.entities.Student
import com.andrei_bch.roomrelationaldatabase.entities.relations.SchoolAndDirector
import com.andrei_bch.roomrelationaldatabase.entities.relations.SchoolWithStudents

@Dao
interface SchoolDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = REPLACE)
    suspend fun insertStudent(student: Student)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>

}