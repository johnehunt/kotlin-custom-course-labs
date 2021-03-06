package com.jjh.android.lib

fun prettyPrint(book: Book) {
    println(book.title)
    println("\tby ${book.author}")
    println("\t\t at a cost of ${book.price}")
}

fun main() {
    println("Welcome to the Bookshop!")

    Bookshop.printDetails()

    println("\nCalculating the Sales Discount price")
    Bookshop.book.salesDiscount = 0.10
    println("Sale price of book: %.2f".format(Bookshop.book.calculateSalePrice()))

    Bookshop.book.numberHeld = 5
    println("Number of copies held: ${Bookshop.book.numberHeld}")

    println(Bookshop.game)

    println("Technical books: ${Bookshop.books[Technical]}")
    println("History books: ${Bookshop.books[History]}")
    println("Fiction books: ${Bookshop.books[Fiction]}")

    println("----------------")

    // Part 1
    val b: Book = Bookshop.book
    prettyPrint(b)

    for (book in Bookshop.books[Technical]!!) {
        prettyPrint(book)
    }

    // Part 2
    val anonymousPrinter = fun(book: Book) {
        println(book.title)
        println("\tby ${book.author}")
        println("\t\t at a cost of ${book.price}")
    }
    anonymousPrinter(b)

    // Part 3
    val lambdaPrinter: (Book) -> Unit = {
        println(it.title)
        println("\tby ${it.author}")
        println("\t\t at a cost of ${it.price}")
    }
    lambdaPrinter(b)

    // Part 4 - callable reference to the function prettyPrint
    val printBook = ::prettyPrint
    printBook(b)

}