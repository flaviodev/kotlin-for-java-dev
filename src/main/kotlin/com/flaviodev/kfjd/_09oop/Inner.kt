package com.flaviodev.kfjd._09oop


fun main() {
    val c = A("test").C()
    c.printName()
}

class A(val name:String) {

    class B (val amount: Int)

    inner class C {
        fun printName() {
            println(this@A.name)
        }
    }
}