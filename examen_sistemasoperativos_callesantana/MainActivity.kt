package com.example.examen_sistemasoperativos_callesantana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.room.Room
import com.example.examen_sistemasoperativos_callesantana.data.SistemasOperativosDatabase
import com.example.examen_sistemasoperativos_callesantana.data.SistemasOperativosRepository
import com.example.examen_sistemasoperativos_callesantana.main.MainScreen
import com.example.examen_sistemasoperativos_callesantana.main.MainViewModel
import com.example.examen_sistemasoperativos_callesantana.main.SistemasOperativosScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(this, SistemasOperativosDatabase::class.java, "SistemasOperativosdb1").build()
        val dao = db.dao
        val repository = SistemasOperativosRepository(dao)
        val viewmodel = MainViewModel(repository)

        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main"){
                composable("main"){

                    MainScreen(navController, viewmodel)

                }

                composable(route="detail"+"/{text}/{text2}/{text3}/{text4}", arguments =  listOf(navArgument(name = "text") {type= NavType.StringType }, (navArgument(name="text2") { type= NavType.StringType }),
                    (navArgument(name="text3"){
                        type= NavType.StringType }
                            ),
                    (navArgument(name="text4"){
                        type= NavType.StringType }
                            )
                )
                )
                {
                    DetailScreen(navController, it.arguments?.getString("text"),
                        it.arguments?.getString("text2"), it.arguments?.getString("text3"), it.arguments?.getString("text4"))
                }

                composable("lista"){
                    SistemasOperativosScreen(viewModel = viewmodel, navController =navController )
                }


            }

        }

    }

}