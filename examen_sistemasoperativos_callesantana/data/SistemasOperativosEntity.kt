package com.example.examen_sistemasoperativos_callesantana.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class SistemasOperativosEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val nombre: String,
    val tipoPlataforma: String,
    val fecha: String,
    val nombreEmpresa: String,

)
