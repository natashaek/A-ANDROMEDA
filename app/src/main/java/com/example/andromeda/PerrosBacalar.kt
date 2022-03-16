package com.example.andromeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosBacalar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_bacalar)

        val botonVolver3 = findViewById<Button>(R.id.botonVolver3)

        botonVolver3.setOnClickListener {
            finish()
        }
    }
}