package com.example.examen_sistemasoperativos_callesantana.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface SistemasOperativosDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertSistemasOperativos(sistemasOperativos:SistemasOperativosEntity)

    @Query("SELECT * FROM SistemasOperativosEntity")
    suspend fun getSistemasOperativos():List<SistemasOperativosEntity>
}