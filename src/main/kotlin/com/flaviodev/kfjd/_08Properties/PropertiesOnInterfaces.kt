package com.flaviodev.kfjd._08Properties

import java.lang.StringBuilder

fun main() {
    val repositories = listOf( RepositoryMemory(), RepositoryMock("A"), RepositoryMock("B"))

    repositories.forEach {
        println(it.notebook)
        analyzeRepository(it)
    }

    val sb = StringBuilder("Kotlin?")
    println("last char ${sb.lastChar}")
    sb.lastChar = '!'
    println(sb)
}

private fun analyzeRepository(repository: Repository) {
    if(repository is RepositoryMock)
        println("pages: ${repository.pages}, indices: ${repository.indices}")
}

interface Repository {
    val notebook: String
}

class RepositoryMemory: Repository {
    override val notebook: String = "Blue notebook"
}

class RepositoryMock(private val name: String): Repository {
    override val notebook: String
        get() = "notebook $name"

    val pages: Int = 30
}

val RepositoryMock.indices
    get() = 0..30

var StringBuilder.lastChar
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length -1, value)
    }