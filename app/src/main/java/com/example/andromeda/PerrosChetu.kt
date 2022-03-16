package com.example.andromeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosChetu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_chetu)

        val botonVolver4 = findViewById<Button>(R.id.botonVolver4)

        botonVolver4.setOnClickListener {
            finish()
        }
    }
}