package com.flaviodev.kfjd._05nullability

fun main() {
    var nullableItensList: List<Int?> = listOf(1, null, 2)
    // nullableItensList = null -> error
    println(nullableItensList)

    var nullableList: List<Int>? = null
    // nullableList = listOf(1,null) -> error
    println(nullableList)

    var fullNullableList: List<Int?>? = null
    fullNullableList = listOf(1, null, 2)
    println(fullNullableList)

    val optional: Optional<String?> = Optional(null)
    println(optional.get())
}

// nullable types != Optional
class Optional<T>(val value: T) {

    fun isPresente() = value != null

    fun get() = value ?: throw NoSuchElementException("No value presente")
}