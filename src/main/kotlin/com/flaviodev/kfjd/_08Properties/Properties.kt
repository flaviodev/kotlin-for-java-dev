package com.flaviodev.kfjd._08Properties

fun main() {

    val person = Person(name = "John", age = 22, gender = Gender.MALE)
    person.print()

    val person2 = Person(name = "John", age = 22, gender = Gender.MALE, description = "tall and black hair")
    person2.print()
}

class Person(val name: String, val age: Int, val gender: Gender) {

    // defining set private
    var description: String? = null
        private set

    // creating get like a property
    val isAgeOver18: Boolean
        get() = age >= 18

    constructor(name: String, age: Int, gender: Gender, description: String) :
            this(name = name, age = age, gender = gender) {
        this.description = description
    }
}

enum class Gender {
    MALE,
    FEMALE
}

private fun Person.pronoun(): String = if (gender == Gender.MALE) "he" else "she"

private fun Person.print() = println("The name of the person is $name, ${pronoun()}" +
        " is $age then ${pronoun()} ${if (isAgeOver18) "is" else "not is"} over 18," +
        " ${description ?: "(no description)"}")