@file:Suppress("CAST_NEVER_SUCCEEDS")

package com.flaviodev.kfjd._05nullability

fun main() {
    val s = " "

    println(s as? Int)    // null
    println(s as Int?)    // exception
}