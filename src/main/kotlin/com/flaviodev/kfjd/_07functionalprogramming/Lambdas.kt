package com.flaviodev.kfjd._07functionalprogramming

fun main() {
    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")
    map.mapValues { println("${it.key} => ${it.value}") }
    map.mapValues { (key, value) -> println("$key => $value") }
    map.mapValues { (_, value) -> println(value) }
}