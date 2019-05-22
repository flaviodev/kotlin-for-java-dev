package com.flaviodev.kfjd._08Properties

fun main() {
    val person = Person(name = "John", age = 22, gender = Gender.MALE)

    val message ="The name of the person is ${person.name}, ${person.pronoun()}" +
            " is ${person.age} then ${person.pronoun()} ${if (person.isAgeOver18) "is" else "not is"} over 18"

    println(message)
}

class Person(val name: String, val age: Int, val gender: Gender) {
    val isAgeOver18: Boolean
        get() = age >= 18
}

enum class Gender {
    MALE,
    FEMALE
}

fun Person.pronoun(): String = if (gender == Gender.MALE) "he" else "she"