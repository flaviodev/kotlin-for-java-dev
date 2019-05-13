package com.flaviodev.kfjd._07functionalprogramming

fun main() {
    val sum = { x: Int, y: Int -> x + y }

    println("Sum using a function as variable : 2 + 2 -> ${sum(2, 2)}")

    // nullability

    // return type is nullable
    val functionThatCanReturnNull: () -> Int? = { null }
    println(functionThatCanReturnNull())

    // the variable is nullable
    var functionThatCanBeAssignedNull: (() -> Int)? = null
    println(functionThatCanBeAssignedNull?.let { it() }) // or
    println(functionThatCanBeAssignedNull?.invoke())

    functionThatCanBeAssignedNull = { 5 }

    println(functionThatCanBeAssignedNull())

    println(executeFunction(functionThatCanBeAssignedNull))
}

// function that receive a function
fun executeFunction(function: (() -> Int)?) = function?.let { it() }
