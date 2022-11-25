package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
        pasartareas()
        pasarinicio()
        pasarrecetas()
        cerrarseion()
    }
    fun pasartareas(){
        val ImageView = findViewById<ImageView>(R.id.imageView65)
        ImageView.setOnClickListener {
            val intent = Intent (this,Tareas::class.java)
            startActivity(intent)
        }
    }

    fun pasarinicio(){
        val ImageView = findViewById<ImageView>(R.id.imageView67)
        ImageView.setOnClickListener {
            val intent = Intent (this,MenuInicio::class.java)
            startActivity(intent)
        }
    }

    fun pasarrecetas(){
        val ImageView = findViewById<ImageView>(R.id.imageView68)
        ImageView.setOnClickListener {
            val intent = Intent (this,Recetas::class.java)
            startActivity(intent)
        }
    }
    fun cerrarseion(){
        val ImageView = findViewById<ImageView>(R.id.imageView76)
        ImageView.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}