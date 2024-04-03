package com.rahmadev.delibrary.model

data class Book(
    val id: Int,
    val title: String,
    val image: Int,
    val language: String,
    val subject: String,
    val author: String,
    val publisher: String,
    val description: String,
    val bookLocation: String,
    val year: Int,
    val bookStatus: String
)
