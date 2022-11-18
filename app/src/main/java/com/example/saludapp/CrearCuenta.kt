package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CrearCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)
        Regresar()
        Registrar()
    }

    fun Regresar(){

        val ImageView = findViewById<ImageView>(R.id.imageViewRegresar)
        ImageView.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun Registrar(){

        val ImageView = findViewById<ImageView>(R.id.imageViewregistrar)
        ImageView.setOnClickListener{
            val intent = Intent(this,MenuInicio::class.java)
            startActivity(intent)
        }
    }
}