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

        // val bLugarUno = findViewById<Button>(R.id.bLugarUno)
        val botonFcp = findViewById<Button>(R.id.botonFcp)
        val botonChetu = findViewById<Button>(R.id.botonChetu)
        val botonTulum = findViewById<Button>(R.id.botonTulum)
        val botonPlayaDC = findViewById<Button>(R.id.botonPlayaDC)
        val botonCancun = findViewById<Button>(R.id.botonPlayaDC)

        botonFcp.setOnClickListener {
            var intent = Intent(this, PerrosFcp::class.java)
            startActivity(intent)

        }
        val mensaje = intent.getStringExtra("MENSAJE")

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

    }
}