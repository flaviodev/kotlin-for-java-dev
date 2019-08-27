package com.flaviodev.kfjd._09oop

fun main() {
    val lista = listOf("primeiro", "segundo", "terceiro")
    val listaVazia = listOf<String>()

    println(lista.primeiroOuNulo())
    println(listaVazia.primeiroOuNulo())

    val drinks = listOf(Coffee(), Beer(), Wine())
    toDrink(drinks)

    toDrinkNullable(listOf(Watter(), Wine(), null))

    Coffee().printTypeVolume()
    Wine().printTypeVolume()

    println(drinks.filterByTypeVolume<Int>()) // passing type on function

    println(oneHalf(13))
    println(oneHalf(null))

    println(max(5,3))
    println(max(3,5))
    println(max("java","kotlin"))

    val sentence = StringBuilder("Hello, world")
    ensureTrailingPeriod(sentence)
    println(sentence)

    println(listOf(1,2,3,4).average())
    println(listOf(1.0,2.0,3.0,4.0).average())


}

fun <T> List<T>.primeiroOuNulo(): T? = this.firstOrNull()

fun <V, T : Drink<out V>> toDrink(list: List<T>) = toDrinkNullable(list)

fun <V, T : Drink<out V>?> toDrinkNullable(list: List<T>) = list.forEach { println(it?.name) }

fun <T : Number?> oneHalf(value : T): Double? = value?.let { value.toDouble() / 2.0 }

fun <T : Comparable<T>> max(first: T, second: T): T = if(first > second) first else second

fun <T> ensureTrailingPeriod(seq: T) where T: CharSequence, T: Appendable {
    if(!seq.endsWith('.')) seq.append('.')
}

@JvmName("averageOfDouble")
fun List<Double>.average(): Double = this.reduce {sum, element -> sum + element} / this.size

@JvmName("averageOfInt")
fun List<Int>.average(): Int = this.reduce {sum, element -> sum + element} / this.size

interface Bottle<out V> {
    fun getVolume(): V
}

inline fun <reified V> Drink<V>.printTypeVolume() {
    println(V::class.java)
}

inline fun <reified V> List<Drink<*>>.filterByTypeVolume(): List<Drink<*>> {
    return this.filter { it.getVolume() is V  }.toList()
}

sealed class Drink<V>(val name: String): Bottle<V> {
    override fun toString(): String {
        return name
    }
}

class Watter: Drink<Int>("watter") {
    override fun getVolume(): Int = 1000
}

class Wine: Drink<Double>("wine") {
    override fun getVolume(): Double = 1.5
}

class Coffee: Drink<Int>("coffee") {
    override fun getVolume(): Int = 100
}

class Beer: Drink<Int>("beer") {
    override fun getVolume(): Int = 350
}
