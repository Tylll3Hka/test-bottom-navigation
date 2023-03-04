package com.tylllenka.testnavigation.bottomNav

import com.tylllenka.testnavigation.R

sealed class Item(
    val title: String,
    val icoId: Int,
    val route: String
) {
    object Home: Item("Home", R.drawable.icon, "home")
    object Chat: Item("Chat", R.drawable.icon, "chat")
    object More: Item("More", R.drawable.icon, "more")
}
