package com.flaviodev.kfjd._08Properties

import kotlin.String
import kotlin.getValue
import kotlin.lazy

fun main() {

    val lazyValue: String by lazy {
         println("computed")
        "Hello"
    }

    println(lazyValue)

    val kotlinActivity = KotlinActivity()
    kotlinActivity.onCreate("STARTING")
    kotlinActivity.printMyStateLength()

    val kotlinActivity2 = KotlinActivity()
    kotlinActivity2.printMyStateLength()
}

open class Activity {
    open fun onCreate(state: String) {
        println("state: $state")
    }
}

class KotlinActivity: Activity() {
    lateinit var myState: String

    override fun onCreate(state: String) {
        myState = state
    }

    fun printMyStateLength() {
        if(this::myState.isInitialized)
          println(myState.length)
    }
}


