package com.touch4it.librarymanagementsystem

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.touch4it.librarymanagementsystem.business.Book
import com.touch4it.librarymanagementsystem.business.Librarian
import com.touch4it.librarymanagementsystem.business.Library
import com.touch4it.librarymanagementsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val library = Library()

    val librarian1 = Librarian(1, "John Doe")
    val librarian2 = Librarian(2, "Jane Doe")

    val book1 = Book("The Hobbit", "J.R.R. Tolkien")
    val book2 = Book("Sherlock Holmes", "Arthur Conan Doyle")
    val book3 = Book("Clean Architecture", "Robert C. Martin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupLibrary()
        setupBookActions(binding)
    }

    /*
    *
    * Zadanie OOP:
    *   - napis logiku, ktora umozni
    *       - pridavat / odoberat knihy do kniznice
    *       - pozicat / vratit knihy z kniznice
    *       - vylistovat dostupne knihy
    *   - ako vieme rozsirit aktualnu implementaciu o typ knihy (rozpravka, detektivka...)
    *   - ako vieme rozsirit aktualnu implementaciu o knihovnika, ktory moze knihy len prijmat, ale nie vydavat
    *
    * */


    /*
    *
    * Zadanie Android:
    *   - ako vieme modifikovat kod aby zmeny
    *       - vykonane pocas behu aplikacie boli zachovane pocas zmeny konfiguracie
    *       - vykonane pocas behu pocas "process death"
    *
    * */

    private fun setupLibrary() {
    }

    private fun setupBookActions(binding: ActivityMainBinding) {

        binding.addBook.setOnClickListener {

        }

        binding.removeBook.setOnClickListener {

        }

        binding.borrowBook.setOnClickListener {

        }

        binding.returnBook.setOnClickListener {

        }
    }
}