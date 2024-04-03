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
            R.drawable.software1,
            "English",
            "Programming-Software Engineering",
            "Roger Pressman",
            "Mc Graw Hill",
            "Key Features : *the latest versions of\n" +
                    "Java and UML *Increased coverage of distributed \n" +
                    "system including security and e-commerce \n" +
                    "*Exmination of the web and its implications for \n" +
                    "software engineering",
            "LT.2",
            2021,
            "Tersedia"
        ),
        Book(
            2,
            "Modern Software Engineering",
            R.drawable.software,
            "Indonesia",
            "Programming-Software Engineering",
            "Roger Pressman",
            "Mc Graw Hill",
            "Key Features : *the latest versions of\n" +
                    "Java and UML *Increased coverage of distributed \n" +
                    "system including security and e-commerce \n" +
                    "*Exmination of the web and its implications for \n" +
                    "software engineering",
            "LT.2",
            2022,
            "Dipinjam"
        ),
        Book(
            3,
            "Jaringan Komputer",
            R.drawable.jaringan,
            "Indonesia",
            "Jaringan",
            "Roger Pressman",
            "Mc Graw Hill",
            "Key Features : *the latest versions of\n" +
                    "Java and UML *Increased coverage of distributed \n" +
                    "system including security and e-commerce \n" +
                    "*Exmination of the web and its implications for \n" +
                    "software engineering",
            "LT.2",
            2020,
            "Tersedia"
        ),
        Book(
            4,
            "Dasar Algoritma JavaScript",
            R.drawable.javascript,
            "Indonesia",
            "Programming-Software Engineering",
            "Roger Pressman",
            "Mc Graw Hill",
            "Key Features : *the latest versions of\n" +
                    "Java and UML *Increased coverage of distributed \n" +
                    "system including security and e-commerce \n" +
                    "*Exmination of the web and its implications for \n" +
                    "software engineering",
            "LT.2",
            2023,
            "Tersedia"
        ),
        Book(
            5,
            "Kalkulus",
            R.drawable.kalkulus,
            "Indonesia",
            "Programming-Software Engineering",
            "Roger Pressman",
            "Mc Graw Hill",
            "Key Features : *the latest versions of\n" +
                    "Java and UML *Increased coverage of distributed \n" +
                    "system including security and e-commerce \n" +
                    "*Exmination of the web and its implications for \n" +
                    "software engineering",
            "LT.2",
            2023,
            "Dipinjam"
        ),
        Book(
            6,
            "Pengantar Komputer",
            R.drawable.pengantar_komputer,
            "Indonesia",
            "Programming-Software Engineering",
            "Roger Pressman",
            "Mc Graw Hill",
            "Key Features : *the latest versions of\n" +
                    "Java and UML *Increased coverage of distributed \n" +
                    "system including security and e-commerce \n" +
                    "*Exmination of the web and its implications for \n" +
                    "software engineering",
            "LT.2",
            2022,
            "Dipinjam"
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
            "Introduction to Software Engineering",
            R.drawable.rethinking
        ),
        FavoriteBook(
            4,
            "Example of Software Engineering Implementation",
            R.drawable.rethinking
        ),
        FavoriteBook(
            5,
            "Evaluation for Software Engineering Process",
            R.drawable.rethinking
        )
    )
}