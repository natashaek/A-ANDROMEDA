package com.example.andromeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosPlayaDC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_playa_dc)

        val botonVolver6 = findViewById<Button>(R.id.botonVolver6)

        botonVolver6.setOnClickListener {
            finish()
        }
    }
}