package com.example.andromeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perro33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perro33)

        val botonVolver = findViewById<Button>(R.id.botonVolver)

        botonVolver.setOnClickListener {
            finish()
        }
    }
}