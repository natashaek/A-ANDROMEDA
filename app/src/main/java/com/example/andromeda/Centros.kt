package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Centros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_centros)

        val botonFcp = findViewById<Button>(R.id.botonFcp)
        val botonBacalar = findViewById<Button>(R.id.botonBacalar)
        val botonChetu = findViewById<Button>(R.id.botonChetu)
        val botonTulum = findViewById<Button>(R.id.botonTulum)
        val botonPlayaDC = findViewById<Button>(R.id.botonPlayaDC)
        val botonCancun = findViewById<Button>(R.id.botonCancun)

        botonFcp.setOnClickListener {
            var intent = Intent(this, PerrosFcp::class.java)
            startActivity(intent)

        }
        botonBacalar.setOnClickListener {
            var intent = Intent(this, PerrosBacalar::class.java)
            startActivity(intent)

        }
        botonChetu.setOnClickListener {
            var intent = Intent(this, PerrosChetu::class.java)
            startActivity(intent)

        }
        botonTulum.setOnClickListener {
            var intent = Intent(this, PerrosTulum::class.java)
            startActivity(intent)

        }
        botonPlayaDC.setOnClickListener {
            var intent = Intent(this, PerrosPlayaDC::class.java)
            startActivity(intent)

        }
        botonCancun.setOnClickListener {
            var intent = Intent(this, PerrosCancun::class.java)
            startActivity(intent)

        }
      /*  val mensaje = intent.getStringExtra("MENSAJE")

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()*/

    }
}