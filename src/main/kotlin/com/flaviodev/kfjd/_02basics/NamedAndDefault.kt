package com.flaviodev.kfjd._02basics

fun main() {
    displaySeparator()
    displaySeparator(character = 'a', size = 3)
    displaySeparator(size = 3, character = 'b')
    displaySeparator('3',1)
}

@JvmOverloads
fun displaySeparator(character: Char = '*', size: Int = 10): Unit = repeat(size) { print(character) }
