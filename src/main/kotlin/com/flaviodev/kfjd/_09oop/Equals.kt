package com.flaviodev.kfjd._09oop

fun main() {
    var e1 = Erase(10)
    var e2 = Erase(10)

    println(e1 == e2)
    println(e1 === e2)

    e1 =e2
    println(e1 === e2)

    var p1 = Pencil(color = "black")
    var p2 = Pencil(color = "black")

    println(p1 == p2)

    p1 = p2
    println(p1 == p2)
}


data class Erase (val size: Int)

class Pencil (val color: String)