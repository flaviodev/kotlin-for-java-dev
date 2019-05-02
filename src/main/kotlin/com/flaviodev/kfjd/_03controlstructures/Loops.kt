@file:JvmName("Math")

package com.flaviodev.kfjd._03controlstructures

fun main() {
    loopRepeat()
    forOverMap()
    forWithIndex()
    loopRepeat()
    forUsindRanges()
    loopRepeat()
    forUsingUntil()
    loopRepeat()
    forUsingStep()
    loopRepeat()
    forOverChars()
}

fun loopRepeat() {
    repeat(10) {
        print("-")
    }.also { println("") }
}

fun forOverMap() {
    val map = mapOf(Pair(204, "No content"), Pair(404, "Resource not find"), Pair(200, "Ok"))
    for((code,status) in map) {
        println("$code -> $status")
    }
}

fun forWithIndex() {
    val list = listOf("a", "b", "c", "d")
    for ((index, value) in list.withIndex()) {
        println("$index = $value")
    }
}

fun forUsindRanges() {
    // including upper bound
    for (i in (0..9)) {
        println("index = $i")
    }
}

fun forUsingUntil() {
    // excluding upper bound
    for (i in 0 until 9) {
        println("index = $i")
    }
}

fun forUsingStep() {
    for (i in 9 downTo 1 step 2) {
        println("index = $i")
    }
}

fun forOverChars() {
    for (ch in "abc") {
        print(ch + 1)
    }
}
