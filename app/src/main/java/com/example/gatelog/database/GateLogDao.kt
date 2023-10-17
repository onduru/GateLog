package com.example.gatelog.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface GateLogDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(gatelogs: GateLogs)

    @Update
    suspend fun update(gatelogs: GateLogs)

    @Delete
    suspend fun delete(gatelogs: GateLogs)

    @Query("SELECT * from gatelogs WHERE id = :id")
    fun getItem(id: Int): Flow<GateLogs>

    @Query("SELECT * from gatelogs ORDER BY name ASC")
    fun getAllItems(): Flow<List<GateLogs>>
}