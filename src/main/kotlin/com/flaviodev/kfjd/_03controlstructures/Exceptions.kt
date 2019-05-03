package com.flaviodev.kfjd._03controlstructures

import java.io.IOException
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    println(validationUsingATry("uuuy"))
    throwingAnExceptionForAnInvalidNumber(100)
    try {
        bar()
    } catch (e: IOException) {
        println("IOException")
    }
}

fun throwingAnExceptionForAnInvalidNumber(number: Int) {
    if (number in 1..100) number
    else throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")
}

fun validationUsingATry(digits: String) = try { Integer.parseInt(digits) } catch (e: NumberFormatException) { -1 }

@Throws(IOException::class)
fun bar() {
    throw IOException()
}