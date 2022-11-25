package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MenuInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_inicio)
        galeria()
        pasartar()
        pasarecetas()
        pasarperfil()
        parte2()

    }
    fun pasartar(){
        val ImageView = findViewById<ImageView>(R.id.imageView27)
        ImageView.setOnClickListener {
            val intent = Intent (this,Tareas::class.java)
            startActivity(intent)
        }
    }
    fun pasarecetas(){
        val ImageView = findViewById<ImageView>(R.id.imageView31)
        ImageView.setOnClickListener {
            val intent = Intent (this,Recetas::class.java)
            startActivity(intent)
        }
    }

    fun pasarperfil(){
        val ImageView = findViewById<ImageView>(R.id.imageView30)
        ImageView.setOnClickListener {
            val intent = Intent (this,Perfil::class.java)
            startActivity(intent)
        }
    }

    fun galeria() {
        val galerialist =
            listOf(R.drawable.inicioparte1, R.drawable.inicioparte11, R.drawable.inicioparte12)
        val ImagenGaleria = findViewById<ImageView>(R.id.imageView6)
        val ImagenBtonSigGaleria = findViewById<ImageView>(R.id.imageView2)
        var pos = 0
        ImagenBtonSigGaleria.setOnClickListener{

            if (pos < galerialist.size){
                ImagenGaleria.setImageDrawable( ContextCompat.getDrawable(it.context,galerialist[pos]))
                pos++
            }
            else{
                pos = 0

            }

       }
    }
    fun parte2() {
        val galerialist =
            listOf(R.drawable.inicioparte2, R.drawable.inicioparte21, R.drawable.inicioparte22)
        val ImagenGaleria = findViewById<ImageView>(R.id.imageView10)
        val ImagenBtonSigGaleria = findViewById<ImageView>(R.id.imageView9)
        var pos = 0
        ImagenBtonSigGaleria.setOnClickListener{

            if (pos < galerialist.size){
                ImagenGaleria.setImageDrawable( ContextCompat.getDrawable(it.context,galerialist[pos]))
                pos++
            }
            else{
                pos = 0

            }

        }
    }

}