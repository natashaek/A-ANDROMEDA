package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerrosFcp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perros_fcp)

        val botonPerro1 = findViewById<Button>(R.id.botonPerro1)
        val botonPerro2 = findViewById<Button>(R.id.botonPerro2)
        val botonPerro3 = findViewById<Button>(R.id.botonPerro3)
        val botonPerro4 = findViewById<Button>(R.id.botonPerro4)
        val botonPerro5 = findViewById<Button>(R.id.botonPerro5)
        val botonPerro6 = findViewById<Button>(R.id.botonPerro6)

        botonPerro1.setOnClickListener {
            var intent = Intent(this, Perro1::class.java)
            startActivity(intent)
        }

        botonPerro2.setOnClickListener {
            var intent = Intent(this, Perro2::class.java)
            startActivity(intent)
        }

        botonPerro3.setOnClickListener {
            var intent = Intent(this, Perro2::class.java)
            startActivity(intent)
        }

        botonPerro3.setOnClickListener {
            var intent = Intent(this, Perro3::class.java)
            startActivity(intent)
        }

        botonPerro4.setOnClickListener {
            var intent = Intent(this, Perro4::class.java)
            startActivity(intent)
        }

        botonPerro5.setOnClickListener {
            var intent = Intent(this, Perro5::class.java)
            startActivity(intent)
        }

        botonPerro6.setOnClickListener {
            var intent = Intent(this, Perro6::class.java)
            startActivity(intent)
        }



        val botonVolver2 = findViewById<Button>(R.id.botonVolver2)

        botonVolver2.setOnClickListener {
            finish()
        }




    }
}