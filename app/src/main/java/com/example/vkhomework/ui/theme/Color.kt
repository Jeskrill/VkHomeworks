package com.example.vkhomework.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val LightRed = Color(0xFFFF6C6C)
val DarkRed = Color(0xFFBE3B3B)
val LightBlue = Color(0xFF66A2EF)
val DarkBlue = Color(0xFF2657B2)

val DarkGray = Color(0xFFA6A6A6)
val LightGray = Color(0xFFEAEAEA)
val RedGradient = Brush.horizontalGradient(
    colors = listOf(DarkRed, LightRed)
)
val BlueGradient = Brush.horizontalGradient(
    listOf(DarkBlue,LightBlue)
)

val GrayGradient = Brush.horizontalGradient(
    listOf(DarkGray,LightGray)
)