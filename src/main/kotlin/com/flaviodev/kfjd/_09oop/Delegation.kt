package com.flaviodev.kfjd._09oop

class Controller<I, T>(
        repository: Repository<I,T>
): Repository<I ,T> by repository // by delegation to ...

fun main() {
    val bookController = Controller(BookRepository())

    create(bookController, Book("8eb51bcb-876e-4baf-90e6-c227d5eb0fb0", "Odyssey", "Homer"))
    create(bookController, Book("cd0e5ec4-6330-434d-b2ac-389e5f28c685", "Iliad", "Homer"))

    println(findById(bookController,"8eb51bcb-876e-4baf-90e6-c227d5eb0fb0"))
    println(findAll(bookController))

    delete(bookController, "8eb51bcb-876e-4baf-90e6-c227d5eb0fb0")

    println(findById(bookController,"8eb51bcb-876e-4baf-90e6-c227d5eb0fb0"))
    println(findAll(bookController))
}

interface Repository<I, T> {
    fun create(e: T): T
    fun delete(id: I)
    fun getById(id: I): T?
    fun getAll(): List<T>
}

fun <I, T> create(controller: Controller<I, T>, e: T) {
    controller.create(e)
}

fun <I, T> delete(controller: Controller<I, T>, id: I) {
    controller.delete(id)
}

fun <I, T> findById(controller: Controller<I, T>, id: I) : T? {
    return controller.getById(id)
}

fun <I, T> findAll(controller: Controller<I, T>): List<T> {
    return controller.getAll()
}

sealed class Entity<I>(open val id: I)

data class Book(override val id: String, val title: String, val author: String): Entity<String>(id)

class BookRepository(): Repository<String, Book> {
    private val books = mutableMapOf<String, Book>()

    override fun create(e: Book): Book {
        books[e.id] = e
        return e
    }

    override fun delete(id: String) {
        books.remove(id)
    }

    override fun getById(id: String): Book? {
        return books[id]
    }

    override fun getAll(): List<Book> {
        return books.values.toList()
    }
}