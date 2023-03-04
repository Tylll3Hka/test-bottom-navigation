package com.tylllenka.testnavigation.bottomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tylllenka.testnavigation.screens.*

@Composable
fun NavGraph(
    navHost: NavHostController
) {
    NavHost(navController = navHost, startDestination = Item.Home.route) {
        composable(Item.Home.route) {
            Home()
        }
        composable(Item.Chat.route) {
            Chat()
        }
        composable(Item.More.route) {
            More()
        }
    }
}