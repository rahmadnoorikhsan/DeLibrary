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
            R.drawable.software
        ),
        Book(
            4,
            "Modern Software Engineering",
            R.drawable.software
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
            R.drawable.rethinking
        ),
        FavoriteBook(
            3,
            "Best Practice Software Engineer",
            R.drawable.rethinking
        ),
        FavoriteBook(
            4,
            "Best Practice Software Engineer",
            R.drawable.rethinking
        ),
        FavoriteBook(
            5,
            "Best Practice Software Engineer",
            R.drawable.rethinking
        )
    )
}