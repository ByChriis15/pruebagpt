package com.example.examen_sistemasoperativos_callesantana.main

data class MainState(
    val nombre: String="",
    val tipoPlataforma: String="",
    val fecha: String="",
    val nombreEmpresa: String="",
    val nombres: List<SistemasOperativos> = emptyList()

)
