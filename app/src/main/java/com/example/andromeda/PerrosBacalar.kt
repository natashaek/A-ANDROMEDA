package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosBacalar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_bacalar)

        val botonPerro7 = findViewById<Button>(R.id.botonPerro1)
        val botonPerro8 = findViewById<Button>(R.id.botonPerro2)
        val botonPerro9 = findViewById<Button>(R.id.botonPerro3)
        val botonPerro10 = findViewById<Button>(R.id.botonPerro4)
        val botonPerro11 = findViewById<Button>(R.id.botonPerro5)
        val botonPerro12 = findViewById<Button>(R.id.botonPerro6)

        botonPerro7.setOnClickListener {
            var intent = Intent(this, Perro7::class.java)
            startActivity(intent)
        }

        botonPerro8.setOnClickListener {
            var intent = Intent(this, Perro8::class.java)
            startActivity(intent)
        }

        botonPerro9.setOnClickListener {
            var intent = Intent(this, Perro9::class.java)
            startActivity(intent)
        }

        botonPerro10.setOnClickListener {
            var intent = Intent(this, Perro10::class.java)
            startActivity(intent)
        }

        botonPerro11.setOnClickListener {
            var intent = Intent(this, Perro11::class.java)
            startActivity(intent)
        }

        botonPerro12.setOnClickListener {
            var intent = Intent(this, Perro12::class.java)
            startActivity(intent)
        }



        val botonVolver3 = findViewById<Button>(R.id.botonVolver3)

        botonVolver3.setOnClickListener {
            finish()
        }
    }
}