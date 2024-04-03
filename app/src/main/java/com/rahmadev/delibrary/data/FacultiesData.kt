package com.rahmadev.delibrary.data

import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.model.Book
import com.rahmadev.delibrary.model.Faculty
import com.rahmadev.delibrary.model.FavoriteBook

object FacultiesData {
    val faculties = listOf(
        Faculty(
            1,
            "FITE"
        ),
        Faculty(
            2,
            "VOKASI"
        ),
        Faculty(
            3,
            "FB"
        ),
        Faculty(
            4,
            "FIT"
        ),
    )

    val books = listOf(
        Book(
            1,
            "Software Engineering",
            R.drawable.software1
        ),
        Book(
            2,
            "Modern Software Engineering",
            R.drawable.software
        ),
        Book(
            3,
            "Modern Software Engineering",
            R.drawable.buku4
        ),
        Book(
            4,
            "Modern Software Engineering",
            R.drawable.buku5
        ),
        Book(
            5,
            "Modern Software Engineering",
            R.drawable.software
        )
    )

    val favoritebook = listOf(
        FavoriteBook(
            1,
            "Rethinking Productivity in Software Engineer",
            R.drawable.rethinking,
        ),
        FavoriteBook(
            2,
            "Best Practice Software Engineer",
            R.drawable.buku
        ),
        FavoriteBook(
            3,
            "Introduction to Software Engineering",
            R.drawable.buku1
        ),
        FavoriteBook(
            4,
            "Example of Software Engineering Implementation",
            R.drawable.buku2
        ),
        FavoriteBook(
            5,
            "Evaluation for Software Engineering Process",
            R.drawable.buku3
        )
    )
}