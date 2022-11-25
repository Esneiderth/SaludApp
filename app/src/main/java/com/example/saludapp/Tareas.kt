package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Tareas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tareas)
        pasarinicio()
        pasarecetas()
    }
    fun pasarinicio(){
        val ImageView = findViewById<ImageView>(R.id.imageView14)
        ImageView.setOnClickListener {
            val intent = Intent (this,MenuInicio::class.java)
            startActivity(intent)
        }
    }
    fun pasarecetas(){
        val ImageView = findViewById<ImageView>(R.id.imageView35)
        ImageView.setOnClickListener {
            val intent = Intent (this,Recetas::class.java)
            startActivity(intent)
        }
    }
    fun pasarperfil(){
        val ImageView = findViewById<ImageView>(R.id.imageView34)
        ImageView.setOnClickListener {
            val intent = Intent (this,Perfil::class.java)
            startActivity(intent)
        }
    }

}