package com.flaviodev.kfjd._03controlstructures

import com.flaviodev.kfjd._01fromjavatokotlin.Color
import java.lang.Exception

fun main() {
    ifElseInline()
    println(whenWithEnumColor(color = Color.BLUE))
    println(whenUsingString(answer = "y"))
    println(mix(color1 = Color.YELLOW, color2 = Color.RED))
    println(whenUsingIs(Cat()))
    println(whenUsingIs(Dog()))
}

fun ifElseInline() {

    val value = (1..10).random()

    // No ternary (true) ? "true" : "false"
    println(if (value >= 5) "$value >= 5 then is Good" else "$value < 5 then is not Good")
}

fun whenWithEnumColor(color: Color) = when (color) {
    Color.BLUE -> "Cold"
    Color.ORANGE -> "Mild"
    else -> "Hot"
}

fun whenUsingString(answer: String) = when (answer) {
    "yes", "y" -> "The answer is Yes"
    "no", "n" -> "The answer is No"
    else -> "Invalid answer"
}

fun mix(color1: Color, color2: Color) =
        when (setOf(color1, color2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.RED, Color.BLUE) -> Color.VIOLET
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            else -> null
        }

open class Pet() {}

class Cat() : Pet() {
    fun meow() = "Meoooooow"
}

class Dog(): Pet() {
    fun woof() = "Woof, woof, woof"
}

fun whenUsingIs(pet: Pet) = when (pet) {
    is Dog -> pet.woof()
    is Cat -> pet.meow()
    else -> throw Exception("Choose a pet")
}