package com.example.andromeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosTulum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_tulum)

        val botonVolver5 = findViewById<Button>(R.id.botonVolver5)

        botonVolver5.setOnClickListener {
            finish()
        }
    }
}