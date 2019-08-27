package com.flaviodev.kfjd._09oop


const val answer = 42

@JvmField
val prop = Activity() // no getter

// the same as java
// public static final Activity prop = new Activity();

fun main() {
    println(answer)
    println(SuperComputer.answer)
    prop.doThis("value")
}

object SuperComputer {
    const val answer = 35
}