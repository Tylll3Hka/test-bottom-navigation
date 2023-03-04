package com.tylllenka.testnavigation.bottomNav

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomTestNavigation(
    navController: NavController
) {
    val items = listOf(Item.Home, Item.Chat, Item.More)

    BottomNavigation(backgroundColor = Color.White) {
        val backStackEntry by navController.currentBackStackEntryAsState()

        backStackEntry?.destination?.route?.let {
            items.forEach { item ->
                BottomNavigationItem(
                    selected = it == item.route,
                    selectedContentColor = Color.Blue,
                    unselectedContentColor = Color.Gray,
                    onClick = { navController.navigate(item.route) },
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icoId),
                            contentDescription = "icoNav"
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            fontSize = 10.sp
                        )
                    }
                )
            }
        }
    }
}