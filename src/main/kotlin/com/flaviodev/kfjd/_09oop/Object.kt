package com.flaviodev.kfjd._09oop

import java.util.*

fun main() {
    MySingleton.run(object : Task { // object expression
        override fun doAnything() {
            println("Task one")
        }
    })

    Scheduler.run(object : Task { // object expression
        override fun doAnything() {
            println("Task two")
        }
    })

    val a1 = Activity()
    a1.doThis("a1")

    val a2 = Activity2()
    a2.doThis("a2")

    val a3 = Activity3()
    a3.doThis("a3")
}

object MySingleton {
    fun run(task: Task) {
        task.doAnything()
    }
}

// or

class Scheduler {
    companion object {
        fun run(task: Task) {
            task.doAnything()
        }
    }
}

class Activity {
    companion object : Logger {
        @JvmStatic override fun info(tag: String, message: String) {
            println("INFO: [$tag] - $message")
        }
    }

    fun doThis(value: String) {
        info("ACTIVITY1", value)
        debug("ACTIVITY1", value)
    }
}

class Activity2 {
    companion object : LoggableClass()

    fun doThis(value: String) {
        logger.info("ACTIVITY2", value)
    }
}

class Activity3 : LoggableClass() {
    fun doThis(value: String) {
        logger.info("ACTIVITY3", value)
    }
}

interface Task {
    fun doAnything()
}

interface Logger {
    fun info(tag: String, message: String)
}

open class LoggableClass {
    val logger = object : Logger {
        override fun info(tag: String, message: String) {
            println("INFO: [$tag] ${Date()} - $message")
        }
    }
}

fun Activity.Companion.debug(tag: String, message: String) = println("DEBUG: [$tag] - $message")