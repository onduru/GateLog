package com.example.gatelog.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Gatelogs")
data class GateLogs(
    @PrimaryKey
    val id: Int = 0,
    val name: String,
    val nationaid: Int,
    val vehicleno: String,
    val mobileno: String,
    val date: String,
)