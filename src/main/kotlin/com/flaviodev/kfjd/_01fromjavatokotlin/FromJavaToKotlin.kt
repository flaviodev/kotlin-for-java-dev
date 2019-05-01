package com.flaviodev.kfjd._01fromjavatokotlin

enum class Color { BLUE, ORANGE, RED }

fun updateWeather(degrees: Int) {
    var i = 0

    val (description, color) =
            when {
                degrees < 10 -> "cold" to Color.BLUE
                degrees < 25 -> "cold" to Color.ORANGE
                else -> "cold" to Color.RED
            }
}