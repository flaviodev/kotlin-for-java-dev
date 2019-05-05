package com.flaviodev.kfjd._04extensions

open class Parent()
class Child(): Parent()

fun Parent.foo() = "Parent"
fun Child.foo() = "Child"

fun String.get(t:String) = t
fun String.get(n:Int) = "*"

fun main() {
    val parent:Parent = Child()
    println(parent.foo()) // Parent, because extension function is like static

    println("abc".get(1)) // member always wins, override dosent works
    println("abc".get("#")) // overload works
}