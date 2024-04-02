package com.rahmadev.delibrary.data

import com.rahmadev.delibrary.R
import com.rahmadev.delibrary.model.Book
import com.rahmadev.delibrary.model.Faculty

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
        )
    )
}