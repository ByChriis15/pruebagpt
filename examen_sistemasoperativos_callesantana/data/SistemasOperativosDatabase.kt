package com.example.examen_sistemasoperativos_callesantana.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SistemasOperativosEntity::class], version =1)
abstract class SistemasOperativosDatabase: RoomDatabase() {

    abstract val dao:SistemasOperativosDao
}
