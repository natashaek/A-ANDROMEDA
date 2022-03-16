package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosChetu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_chetu)

        val botonPerro13 = findViewById<Button>(R.id.botonPerro1)
        val botonPerro14 = findViewById<Button>(R.id.botonPerro2)
        val botonPerro15 = findViewById<Button>(R.id.botonPerro3)
        val botonPerro16 = findViewById<Button>(R.id.botonPerro4)
        val botonPerro17 = findViewById<Button>(R.id.botonPerro5)
        val botonPerro18 = findViewById<Button>(R.id.botonPerro6)

        botonPerro13.setOnClickListener {
            var intent = Intent(this, Perro13::class.java)
            startActivity(intent)
        }

        botonPerro14.setOnClickListener {
            var intent = Intent(this, Perro14::class.java)
            startActivity(intent)
        }

        botonPerro15.setOnClickListener {
            var intent = Intent(this, Perro15::class.java)
            startActivity(intent)
        }

        botonPerro16.setOnClickListener {
            var intent = Intent(this, Perro16::class.java)
            startActivity(intent)
        }

        botonPerro17.setOnClickListener {
            var intent = Intent(this, Perro17::class.java)
            startActivity(intent)
        }

        botonPerro18.setOnClickListener {
            var intent = Intent(this, Perro18::class.java)
            startActivity(intent)
        }


        val botonVolver4 = findViewById<Button>(R.id.botonVolver4)

        botonVolver4.setOnClickListener {
            finish()
        }
    }
}