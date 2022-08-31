package com.example.kinofinder

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initMenuButtons()

    }

    fun initMenuButtons() {
        val menu = findViewById<Button>(R.id.btn_menu)
        val favorites = findViewById<Button>(R.id.btn_favorites)
        val watchLater = findViewById<Button>(R.id.btn_watch_later)
        val selections = findViewById<Button>(R.id.btn_selections)
        val settings = findViewById<Button>(R.id.btn_settings)

        menu.setOnClickListener{
            Toast.makeText(this, "Меню", Toast.LENGTH_LONG).show()
        }

        favorites.setOnClickListener{
            Toast.makeText(this, "Избранное", Toast.LENGTH_LONG).show()
        }

        watchLater.setOnClickListener{
            Toast.makeText(this, "Смотреть позже", Toast.LENGTH_LONG).show()
        }

        selections.setOnClickListener{
            Toast.makeText(this, "Подборки", Toast.LENGTH_LONG).show()
        }

        settings.setOnClickListener{
            Toast.makeText(this, "Настройки", Toast.LENGTH_LONG).show()
        }
    }
}