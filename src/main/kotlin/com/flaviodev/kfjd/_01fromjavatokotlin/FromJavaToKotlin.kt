package com.flaviodev.kfjd._01fromjavatokotlin

enum class Color { BLUE, ORANGE, RED, YELLOW, GREEN, VIOLET }

fun updateWeather(degrees: Int) =
        when {
            degrees < 10 -> "cold" to Color.BLUE
            degrees < 25 -> "warm" to Color.ORANGE
            else -> "hot" to Color.RED
        }
