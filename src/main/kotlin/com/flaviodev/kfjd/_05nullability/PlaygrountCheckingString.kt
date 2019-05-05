package com.flaviodev.kfjd._05nullability

fun String?.isEmptyOrNull() = this?.isEmpty() ?: true

infix fun <T> T.eq(value: T): Boolean = this == value

fun main() {

    val s1: String? = null
    val s2: String? = ""
    println(s1.isEmptyOrNull() eq true)
    println(s2.isEmptyOrNull() eq true)

    val s3 = "   "
    println(s3.isEmptyOrNull() eq false)
}

