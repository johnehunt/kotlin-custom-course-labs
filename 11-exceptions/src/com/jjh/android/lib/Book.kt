package com.jjh.android.lib

class Book(_title: String,
           _price: Double,
           override val author: Author,
           val publisher: Publisher,
           val genre: Genre): Product(_title, _price), Authors {

    override fun toString(): String {
        return "Book(${super.toString()}, author=$author, genre=$genre, publisher=$publisher)"
    }

}