package com.flaviodev.kfjd._03controlstructures

import java.time.LocalDate

fun main() {
    println("Is 'g' a letter? A: ${checkIsLetter('g')}")
    println("Is not 'x' a digit? A: ${isNotDigit('x')}")
    println("Is 'Kotlin' between 'Java' and 'Scala'? A: ${lexicoChecking("Kotlin")}")
    println("Is 'Flavio' equals 'flavio'? A: ${compareStrings(word1 = "Flavio", word2 = "flavio")}")
    println("Is 'Flavio' equals ignore case 'flavio'? A: ${ignoreCaseCompareStrings(word1 = "Flavio", word2 = "flavio")}")
    println(getGratterDAte(LocalDate.of(2019,1,1), LocalDate.of(2019,2,1)))
    println(isListContainsAnElement(list=listOf("apple","banana","orange"),element = "orange"))
}

fun checkIsLetter(character: Char) = character in 'a'..'z' || character in 'A'..'Z'

fun isNotDigit(character: Char) = character !in '0'..'9'

fun lexicoChecking(word: String) = word in "Java".."Scala"

fun compareStrings(word1: String, word2: String) = word1 == word2

fun ignoreCaseCompareStrings(word1: String, word2: String) = word1.equals(word2, ignoreCase = true)

fun getGratterDAte(date1: LocalDate, date2: LocalDate) = if( date1 > date2) date1 else date2

fun isListContainsAnElement(list:List<String>, element: String) = element in list