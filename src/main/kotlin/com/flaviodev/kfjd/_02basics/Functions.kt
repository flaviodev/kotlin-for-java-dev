@file:JvmName("Math")
package com.flaviodev.kfjd._02basics

fun main() {
    printFirstAndSecondValuesAndMaxBetweenThem(1,3, max(1,3))
}

fun max(firstValue: Int, secondValue: Int) :Int = if (firstValue > secondValue) firstValue else secondValue

fun printFirstAndSecondValuesAndMaxBetweenThem(firstValue: Int, secondValue: Int, maxValue: Int) =
    println("The maximum value between $firstValue and $secondValue is $maxValue")
