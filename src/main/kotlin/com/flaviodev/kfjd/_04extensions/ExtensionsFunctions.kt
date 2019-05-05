package com.flaviodev.kfjd._04extensions

import java.lang.StringBuilder

fun String.lastChar() = this.get(this.length - 1)

fun String.repeat(times: Int) : String  {
    val value = StringBuilder(this.length * times)
    repeat(times) {
        value.append(this)
    }
    return value.toString()
}

fun main() {
    println("flavio".lastChar())
    println("flavio".repeat(4))
}