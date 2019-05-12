package com.flaviodev.kfjd._07functionalprogramming


fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    println("Numbers' list -> $list")

    val evenList = list.filter { it % 2 == 0 }
    val oddList = list.filter { it % 2 != 0 }

    println("Even numbers filtered from list -> $evenList")
    println("Odd numbers filtered from list -> $oddList")

    println("Numbers multiplied by two -> ${list.map { it * 2 }}")

    println("List as reversed -> ${list.asReversed()}")

    println("All numbers are grater than zero? -> ${list.all { it > 0 }}")
    println("None of numbers are less than one? -> ${list.none { it < 1 }}")

    println("List has any number? -> ${list.any()}")
    println("List has any number grater than four? -> ${list.any { it > 4 }}")

    println("First element from list -> ${list.first()}")
    println("Last element from list -> ${list.last()}")
    println("First element or null from filtered list -> ${list.firstOrNull { it < 0 }}")

    println("Find first element grater than two -> ${list.find { it > 2 }}")
    println("Find last element less than seven -> ${list.findLast { it < 7 }}")
    println("Last index from list -> ${list.lastIndex}")
    println("Count elements from filtered list -> ${list.filter { it % 2 == 0 }.count()}")
    println("Count elements with condition from list -> ${list.count { it % 2 == 0 }}")

    val (even, odd) = list.partition { it % 2 == 0 }
    println("Even numbers from partitioned list -> $even")
    println("Even numbers from partitioned list -> $odd")

    val persons = listOf(Person(name = "Alice", age = 31),
            Person(name = "Bob", age = 29),
            Person(name = "Carol", age = 31),
            Person(name = "Adam", age = 45))

    println("Grouping persons by age -> ${persons.groupBy { it.age }}")
    println("Associate persons by name -> ${persons.associateBy { it.name }}")
    println("Associate persons by age (removing duplicates) -> ${persons.associateBy { it.age }}")

    println("Persons Max by age -> ${persons.maxBy { it.age }}")

    val anonymousPerson = Person(name = "anybody fallback", age = 100)

    println("Usind gerOrElse -> ${persons.associateBy { it.name }.getOrElse("nobody") { anonymousPerson }.name}")

    println("Map Persons by sorted name -> ${persons.map { it.name }.sorted()}")

    println("Associate numbers of list to a letter -> ${list.associateBy { 'a' + it - 1 }}")
    println("Associate numbers of list to a letter -> ${list.associateBy { 'A' + it - 1 }}")

    println("Associate numbers of list to a letter -> ${list.associate { ('A' + it - 1).toString() + it to it * 100 }}")

    println("Zipping numbers with persons -> ${list.zip(persons)}")
    println("Zip with the next number -> ${list.zipWithNext()}")

    val list2 = listOf(9, 10, 11)
    val list3 = listOf(12, 13, 14, 15)

    val listOfLists = listOf(list, list2, list3)

    println("List of lists -> $listOfLists")
    println("Flatten of List of lists -> ${listOfLists.flatten()}")

    val list4 = listOf(2, 2, 4, 6)
    println("List with repetitions -> $list4")
    println("List with repetitions after distinct -> ${list4.distinct()}")

    val fruits = Food(category = "Fruits", names = listOf("banana", "cherry", "lemon", "apple"))
    val vegetables = Food(category = "Vegetables", names = listOf("tomato", "potato", "beans", "rice"))
    val foodList = listOf(fruits, vegetables)

    println("Food list -> $foodList")
    println("Flatten of map of Food list -> ${foodList.map { it.names }.flatten()}")
    println("FlatMap of Food list -> ${foodList.flatMap { it.names }}") // flatten of map = flatMap


    val allPossiblePairsOfPerson = persons.flatMap { first ->
        persons.map { second -> first to second }
    }

    val (first, second) = allPossiblePairsOfPerson.maxBy { it.first.age - it.second.age }!!
    println("(first and second) Oldests of pairs of person->  ${first.name} and ${second.name}")
    println("Oldest of pairs of person in a simply way->  ${persons.maxBy { it.age }?.name}")
}

fun List<Int>.allNonZero() = this.all { it != 0 }

data class Person(val name: String, val age: Int)
data class Food(val category: String, val names: List<String>)
