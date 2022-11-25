package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Recetas1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recetas1)
        volver()
    }
    fun volver(){

        val ImageView = findViewById<ImageView>(R.id.imageViewvolver)
        ImageView.setOnClickListener{
            val intent = Intent(this,Recetas::class.java)
            startActivity(intent)
        }
    }
}