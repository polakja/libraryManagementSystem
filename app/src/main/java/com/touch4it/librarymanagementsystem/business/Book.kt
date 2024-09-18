package com.touch4it.librarymanagementsystem.business

class Book(
    val title: String,
    val author: String,
    val availability: Availability = Availability.AVAILABLE
) {

    enum class Availability {
        AVAILABLE, NOT_AVAILABLE
    }
}