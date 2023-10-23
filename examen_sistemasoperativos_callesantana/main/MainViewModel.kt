package com.example.examen_sistemasoperativos_callesantana.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen_sistemasoperativos_callesantana.data.SistemasOperativosRepository
import kotlinx.coroutines.launch


class MainViewModel(private val repository: SistemasOperativosRepository): ViewModel() {

    var state by mutableStateOf(MainState())
        private set

    init {
       viewModelScope.launch {
           state=state.copy(
               nombres = repository.getSistemasOperativos()
           )
       }
    }


    fun onNombreChange(nombre: String){
        state=state.copy(
            nombre=nombre
        )

    }


    fun onTipoPlataformaChange(tipoPlataforma: String){
        state=state.copy(
            tipoPlataforma = tipoPlataforma
        )

    }

    fun onFechaChange(fecha: String){
        state=state.copy(
            fecha=fecha
        )
    }


    fun onNombreEmpresaChange(nombreEmpresa: String){
        state=state.copy(
            nombreEmpresa = nombreEmpresa
        )

    }



    fun saveSistemasOperativos(){
        val sistemasOperativos= SistemasOperativos(
            nombre=state.nombre,
            tipoPlataforma = state.tipoPlataforma,
            fecha = state.fecha,
            nombreEmpresa = state.nombreEmpresa
        )

        viewModelScope.launch {
            repository.insertSistemasOperativos(sistemasOperativos)
        }
    }

}