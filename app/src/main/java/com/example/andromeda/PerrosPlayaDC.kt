package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosPlayaDC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_playa_dc)

        val botonPerro25 = findViewById<Button>(R.id.botonPerro1)
        val botonPerro26 = findViewById<Button>(R.id.botonPerro2)
        val botonPerro27 = findViewById<Button>(R.id.botonPerro3)
        val botonPerro28 = findViewById<Button>(R.id.botonPerro4)
        val botonPerro29 = findViewById<Button>(R.id.botonPerro5)
        val botonPerro30 = findViewById<Button>(R.id.botonPerro6)

        botonPerro25.setOnClickListener {
            var intent = Intent(this, Perro25::class.java)
            startActivity(intent)
        }

        botonPerro26.setOnClickListener {
            var intent = Intent(this, Perro26::class.java)
            startActivity(intent)
        }

        botonPerro27.setOnClickListener {
            var intent = Intent(this, Perro27::class.java)
            startActivity(intent)
        }

        botonPerro28.setOnClickListener {
            var intent = Intent(this, Perro28::class.java)
            startActivity(intent)
        }

        botonPerro29.setOnClickListener {
            var intent = Intent(this, Perro29::class.java)
            startActivity(intent)
        }

        botonPerro30.setOnClickListener {
            var intent = Intent(this, Perro30::class.java)
            startActivity(intent)
        }

        val botonVolver6 = findViewById<Button>(R.id.botonVolver6)

        botonVolver6.setOnClickListener {
            finish()
        }
    }
}