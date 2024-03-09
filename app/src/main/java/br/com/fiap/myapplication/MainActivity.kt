package br.com.fiap.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.ui.Modifier

import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import br.com.fiap.myapplication.ui.theme.MyApplicationTheme
import br.com.fiap.navegacao.screens.LoginScreen
import br.com.fiap.navegacao.screens.MenuScreen
import br.com.fiap.navegacao.screens.PedidosScreen

import androidx.navigation.compose.composable

import androidx.navigation.navArgument

import br.com.fiap.navegacao.screens.PerfilScreen



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        composable(route = "login") {
                            LoginScreen(navController) }
                        composable(route = "menu") {
                            MenuScreen(navController) }
                        composable(route = "pedidos") {
                            PedidosScreen(navController) }
                        composable(route = "perfil/{nome}/{idade}",
                            arguments = listOf(navArgument(name="nome"){
                                type = NavType.StringType

                            }, navArgument(name="idade"){
                                type= NavType.IntType
                            })
                        ) {
                            //val nome = it.arguments?.getString("nome")
                            val nome = it.arguments?.getString("nome","")
                            val idade = it.arguments?.getInt("idade",0)
                            PerfilScreen(navController,nome!!,idade!!)
                        }
                    }



                }
            }
        }
    }
}
