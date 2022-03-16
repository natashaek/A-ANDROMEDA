package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosTulum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_tulum)

        val botonPerro19 = findViewById<Button>(R.id.botonPerro1)
        val botonPerro20 = findViewById<Button>(R.id.botonPerro2)
        val botonPerro21 = findViewById<Button>(R.id.botonPerro3)
        val botonPerro22 = findViewById<Button>(R.id.botonPerro4)
        val botonPerro23 = findViewById<Button>(R.id.botonPerro5)
        val botonPerro24 = findViewById<Button>(R.id.botonPerro6)

        botonPerro19.setOnClickListener {
            var intent = Intent(this, Perro19::class.java)
            startActivity(intent)
        }

        botonPerro20.setOnClickListener {
            var intent = Intent(this, Perro20::class.java)
            startActivity(intent)
        }

        botonPerro21.setOnClickListener {
            var intent = Intent(this, Perro21::class.java)
            startActivity(intent)
        }

        botonPerro22.setOnClickListener {
            var intent = Intent(this, Perro22::class.java)
            startActivity(intent)
        }

        botonPerro23.setOnClickListener {
            var intent = Intent(this, Perro23::class.java)
            startActivity(intent)
        }

        botonPerro24.setOnClickListener {
            var intent = Intent(this, Perro24::class.java)
            startActivity(intent)
        }

        val botonVolver5 = findViewById<Button>(R.id.botonVolver5)

        botonVolver5.setOnClickListener {
            finish()
        }
    }
}