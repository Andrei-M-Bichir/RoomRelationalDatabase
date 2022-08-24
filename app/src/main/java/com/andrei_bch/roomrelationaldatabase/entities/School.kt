package com.andrei_bch.roomrelationaldatabase.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class School(
    @PrimaryKey(autoGenerate = false)
    val schoolName: String

)