package com.example.examen_sistemasoperativos_callesantana.data

import com.example.examen_sistemasoperativos_callesantana.main.SistemasOperativos


class SistemasOperativosRepository (private val sistemasOperativosDao: SistemasOperativosDao){
    suspend fun getSistemasOperativos(): List<SistemasOperativos> {
        val entities = sistemasOperativosDao.getSistemasOperativos()
        return entities.map {
            SistemasOperativos(nombre = it.nombre, tipoPlataforma = it.tipoPlataforma, fecha = it.fecha, nombreEmpresa = it.nombreEmpresa)
        }
    }

    suspend fun insertSistemasOperativos(sistemasOperativos: SistemasOperativos) {
        val entity = SistemasOperativosEntity(nombre = sistemasOperativos.nombre, tipoPlataforma = sistemasOperativos.tipoPlataforma, fecha = sistemasOperativos.fecha, nombreEmpresa = sistemasOperativos.nombreEmpresa)
        sistemasOperativosDao.insertSistemasOperativos(entity)
    }



}