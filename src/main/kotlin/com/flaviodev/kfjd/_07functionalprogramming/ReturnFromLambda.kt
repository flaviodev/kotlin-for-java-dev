package com.flaviodev.kfjd._07functionalprogramming

fun main() {

    val list = listOf(3, 0, 5)

    println("Returning [] because return on lambda break the function ->  ${duplicateNonZero(list)}")

    println("Returning correct result using labeled return ->  ${duplicateNonZeroLabeledReturn(list)}")

    println("Returning correct result using labeled return with labelName@ ->  ${duplicateNonZeroLabeledReturnWithLabelName(list)}")

    println("Returning correct result using local function ->  ${duplicateNonZeroLocalFunction(list)}")

    println("Returning correct result using anonymous function ->  ${duplicateNonZeroAnonymousFunction(list)}")

    println("Returning correct result using no return ->  ${duplicateNonZeroNoReturn(list)}")

    print("return@forEach equals continue -> ")
    list.forEach {
        if (it % 2 == 0) return@forEach
        print("$it ")
    }

    print("\nThe same thing using continue ")
    print(" -> ")
    for (e in list) {
        if (e % 2 == 0) continue
        print("$e ")
    }

    print("\nfoo -> ")
    foo(list)

    print("\nbar -> ")
    bar(list)
}

fun <T : Number> duplicateNonZero(list: List<T>): List<T> {
    return list.flatMap {
        if (it == 0) return listOf() // this return breaks the function ...
        listOf(it, it)
    }
}

fun <T : Number> duplicateNonZeroLabeledReturn(list: List<T>): List<T> {
    return list.flatMap {
        if (it == 0) return@flatMap listOf<T>()
        listOf(it, it)
    }
}

fun <T : Number> duplicateNonZeroLabeledReturnWithLabelName(list: List<T>): List<T> {
    return list.flatMap fm@{
        if (it == 0) return@fm listOf<T>()
        listOf(it, it)
    }
}

fun <T : Number> duplicateNonZeroLocalFunction(list: List<T>): List<T> {
    fun duplicateNonZeroElement(e: T): List<T> {
        if (e == 0) return listOf()
        return listOf(e, e)
    }

    return list.flatMap(::duplicateNonZeroElement)
}

fun <T : Number> duplicateNonZeroAnonymousFunction(list: List<T>): List<T> {
    return list.flatMap(fun(e): List<T> {
        if (e == 0) return listOf()
        return listOf(e, e)
    })
}

fun <T : Number> duplicateNonZeroNoReturn(list: List<T>): List<T> {
    return list.flatMap { if (it == 0) listOf() else listOf(it, it) }
}

fun foo(list: List<Int>) {
    list.forEach {
        if (it == 0) return
        print(it)
    }
    println("###") // if list contains 0 ... dosent print
}

fun bar(list: List<Int>) {
    for (e in list) {
        if (e == 0) break
        print(e)
    }
    println("###")
}
