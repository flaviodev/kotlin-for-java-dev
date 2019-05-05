package com.flaviodev.kfjd._04extensions

// java sdk + extensions

val list = arrayListOf("eu", "tu", "ele")

infix fun <A, B> A.para(that: B) = Pair(this, that)

infix fun Int.potencia(e: Int) = Math.pow(this.toDouble(), e.toDouble()).toInt()

val text = """Lorem ipsum dolor sit amet, consectetur adipiscing elit,
    |sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
    |Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
    |Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
    |Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.""".trimMargin()

val regex = """\d{2}-\d{2}-\d{4}""".toRegex()

fun main() {
    println(list.javaClass)
    println(1 para "UM")
    println(2 potencia 8)

    println(text)

    println(regex.matches("01-01-2019"))
    println(regex.matches("01-01-19"))

    println("123".toIntOrNull())
    println("f123".toIntOrNull())
}