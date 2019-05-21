package com.flaviodev.kfjd._08Properties

fun main() {
    val person = Person(name = "John")

    println("The name of the person is ${person.name}")
}

class Person(val name: String)
