package com.example.andromeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perro7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perro7)

        val botonVolver = findViewById<Button>(R.id.botonVolver)

        botonVolver.setOnClickListener {
            finish()
        }
    }
}