package com.example.examen_sistemasoperativos_callesantana.main


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.Button
//import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "pantalla 1")})
        }
    ) {padding ->


        val state = viewModel.state
        Column(
            modifier = Modifier
                .padding()
                .fillMaxWidth()
                .padding(10.dp, 50.dp, 10.dp, 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Nombre: Giusepy Calle")
            Text(text = "Curso: 7B")
            TextField(value = state.nombre, onValueChange = { viewModel.onNombreChange(it) })
            TextField(value = state.tipoPlataforma, onValueChange = { viewModel.onTipoPlataformaChange(it) })
            TextField(value = state.fecha, onValueChange = {viewModel.onFechaChange(it)})
            TextField(value = state.nombreEmpresa, onValueChange = {viewModel.onNombreEmpresaChange(it)})
            Button(onClick = { viewModel.saveSistemasOperativos() }) {
                Text(text = "Guardar", fontSize = 18.sp)
            }

            Button(onClick = { navController.navigate("lista") }) {
                Text(text = "ver lista")
            }
        }
    }
}