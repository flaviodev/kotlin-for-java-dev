package com.flaviodev.kfjd._09oop

sealed class Expr

class Num(val value: Int): Expr()
class Sum(val left: Expr, val right:Expr): Expr()

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
}

fun main() {
    val result = eval(Sum(Num(3),Num(5)))

    print(result)
}