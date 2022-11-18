package com.example.saludapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarSesion()
        crearCuenta()

    }

    fun iniciarSesion(){

        val ImageView = findViewById<ImageView>(R.id.imageViewiniciar)
        ImageView.setOnClickListener{
            val intent = Intent(this,IniciarSesion::class.java)
            startActivity(intent)
        }
    }

    fun crearCuenta(){

        val ImageView = findViewById<ImageView>(R.id.imageViewCrear)
        ImageView.setOnClickListener{
            val intent = Intent(this,CrearCuenta::class.java)
            startActivity(intent)
        }
    }

}