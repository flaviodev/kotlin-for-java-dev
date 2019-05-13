package com.flaviodev.kfjd._07functionalprogramming

fun main() {
    val people = listOf(Person(name = "Flavio", age = 37), Person(name = "Iago", age = 10), Person(name = "Tereza", age = 32))

    println("People by maxBy using member reference -> ${people.maxBy(Person::age)?.name}")

    val isEvenFunction = ::isEven

    // val  isEvenFunction = isEven -> Compilation Error
    println("Using function reference (2 is even) -> ${isEvenFunction(2)}")

    // this is valid too, but member reference allow hid the parameters
    val isEvenFunction2 = { i: Int -> isEven(i) }
    println("Using function reference in other way (2 is even) -> ${isEvenFunction2(2)}")


    val list = listOf(1, 2, 3, 4, 5, 6)

    println("Filtering even using member reference -> ${list.filter(::isEven)}")

    println("Using bound reference -> ${people.maxBy(Person::age)?.getAgePredicate()?.let{ it(50)} }")
}

fun isEven(i: Int): Boolean = i % 2 == 0
