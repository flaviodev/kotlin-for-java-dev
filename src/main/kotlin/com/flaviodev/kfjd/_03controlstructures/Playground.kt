package com.flaviodev.kfjd._03controlstructures

import kotlin.streams.toList

fun isValidIdentifier(s: String): Boolean {
    return s.isNotEmpty() && (s[0].isLetter() || s[0]=='_') && s.slice(1 until  s.length)
            .filter { !it.isLetterOrDigit() }.isEmpty()
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}