package com.flaviodev.kfjd._02basics

fun main(args: Array<String>) {
    println("Hello ${args.map { it }.firstOrNull()}")
            .also { println("Printing null as expression '${null}'") }
            .also { notReassigningVal() }
            .also { reassigningVar() }
            .also { alterMutableListOnVal() }
            .also { createAReadOnluList() }
}

// val or var
fun notReassigningVal() {
    val question = "life, the universe and everything"
    println("$question?")
    //question = "sure?" <--- error
}

fun reassigningVar() {
    var answer = "be"
    println("$answer")
    answer = "or not to be"
    println("$answer")
}

fun alterMutableListOnVal() {
    val list: MutableList<String> = mutableListOf("apple")
    list.add("banana")
    list.add("pineapple")
    println(list.joinToString(separator = ", ",prefix = "Fruits: ",postfix = "."))
}

fun createAReadOnluList() {
    val list : List<String> = listOf("Read","only","list", "is", "immutable")
    // list.add("you can't do it")
    println(list.joinToString(separator = " ", postfix = "."))
}