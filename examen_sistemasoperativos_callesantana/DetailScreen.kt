package com.example.examen_sistemasoperativos_callesantana

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun DetailScreen(navController: NavHostController, texto:String?, texto2: String?, texto3: String?, texto4: String?){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Nombre: ${texto}",
                style = MaterialTheme.typography.h6

            )

            Text(
                text = "TipoPlataforma: ${texto2}",
                style = MaterialTheme.typography.h6
            )

            Text(
                text = "Fecha: ${texto3}",
                style = MaterialTheme.typography.h6
            )

            Text(
                text = "NombreEmpresa: ${texto4}",
                style = MaterialTheme.typography.h6
            )

        }

    }


}