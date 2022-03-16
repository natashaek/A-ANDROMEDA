package com.example.andromeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val username = findViewById<View>(R.id.username) as TextView
        val password = findViewById<View>(R.id.password) as TextView
        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton

        Toast.makeText(this@MainActivity, "Bienvenido/a", Toast.LENGTH_SHORT)
            .show()
        var intent = Intent(this, Centros::class.java)
        startActivity(intent)
        /* //usuario y contra admin admin
        loginbtn.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "admin") {
                //correct

                Toast.makeText(this@MainActivity, "Bienvenido/a", Toast.LENGTH_SHORT)
                    .show()
                var intent = Intent(this, Centros::class.java)
                startActivity(intent)
            } else  //incorrect
                Toast.makeText(
                    this@MainActivity,
                    "Datos incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
        };*/

        */
        val boton = findViewById<Button>(R.id.loginbtn)

        boton.setOnClickListener {
            var intent = Intent(this, Centros::class.java)
            startActivity(intent)
        }

    }
}