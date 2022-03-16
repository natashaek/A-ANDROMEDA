package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosCancun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_cancun)

        val botonPerro31 = findViewById<Button>(R.id.botonPerro1)
        val botonPerro32 = findViewById<Button>(R.id.botonPerro2)
        val botonPerro33 = findViewById<Button>(R.id.botonPerro3)
        val botonPerro34 = findViewById<Button>(R.id.botonPerro4)
        val botonPerro35 = findViewById<Button>(R.id.botonPerro5)
        val botonPerro36 = findViewById<Button>(R.id.botonPerro6)

        botonPerro31.setOnClickListener {
            var intent = Intent(this, Perro31::class.java)
            startActivity(intent)
        }

        botonPerro32.setOnClickListener {
            var intent = Intent(this, Perro32::class.java)
            startActivity(intent)
        }

        botonPerro33.setOnClickListener {
            var intent = Intent(this, Perro33::class.java)
            startActivity(intent)
        }

        botonPerro34.setOnClickListener {
            var intent = Intent(this, Perro34::class.java)
            startActivity(intent)
        }

        botonPerro35.setOnClickListener {
            var intent = Intent(this, Perro35::class.java)
            startActivity(intent)
        }

        botonPerro36.setOnClickListener {
            var intent = Intent(this, Perro36::class.java)
            startActivity(intent)
        }

        val botonVolver6 = findViewById<Button>(R.id.botonVolver6)

        botonVolver6.setOnClickListener {
            finish()
        }
    }
}