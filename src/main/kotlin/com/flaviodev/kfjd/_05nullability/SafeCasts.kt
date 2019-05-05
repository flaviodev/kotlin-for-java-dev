package com.flaviodev.kfjd._05nullability

fun main() {

    val text = "Text"
    val number = 9

    printUpperCaseIfString(text)
    printUpperCaseIfString(number)
}

fun printUpperCaseIfString(value: Any) = println((value as? String)?.toUpperCase() ?: value)