package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat

class Recetas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recetas)
        pasartareas()
        pasarinicio()
        irreceta()
        irreceta2()
        pasarperfil()
        desayunos()
        almuerzos()
        cenas()
    }
    fun pasarperfil(){
        val ImageView = findViewById<ImageView>(R.id.imageView39)
        ImageView.setOnClickListener {
            val intent = Intent (this,Perfil::class.java)
            startActivity(intent)
        }
    }

    fun pasartareas(){
        val ImageView = findViewById<ImageView>(R.id.imageView37)
        ImageView.setOnClickListener {
            val intent = Intent (this,Tareas::class.java)
            startActivity(intent)
        }
    }
    fun pasarinicio(){
        val ImageView = findViewById<ImageView>(R.id.imageView36)
        ImageView.setOnClickListener {
            val intent = Intent (this,MenuInicio::class.java)
            startActivity(intent)
        }
    }
    fun irreceta(){
        val ImageView = findViewById<ImageView>(R.id.imageView15)
        ImageView.setOnClickListener {
            val intent = Intent (this,Recetas1::class.java)
            startActivity(intent)
        }
    }
    fun irreceta2(){
        val ImageView = findViewById<ImageView>(R.id.imageView16)
        ImageView.setOnClickListener {
            val intent = Intent (this,Recetas2::class.java)
            startActivity(intent)
        }
    }

    fun desayunos() {
        val galerialist =
            listOf(R.drawable.receta1, R.drawable.receta12, R.drawable.receta13)
        val ImagenGaleria = findViewById<ImageView>(R.id.imageView15)
        val ImagenBtonSigGaleria = findViewById<ImageView>(R.id.imageView25)
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
    fun almuerzos() {
        val galerialist =
            listOf(R.drawable.receta2, R.drawable.receta21, R.drawable.receta22)
        val ImagenGaleria = findViewById<ImageView>(R.id.imageView16)
        val ImagenBtonSigGaleria = findViewById<ImageView>(R.id.imageView41)
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
    fun cenas() {
        val galerialist =
            listOf(R.drawable.receta3, R.drawable.receta31, R.drawable.receta32)
        val ImagenGaleria = findViewById<ImageView>(R.id.imageView18)
        val ImagenBtonSigGaleria = findViewById<ImageView>(R.id.imageView57)
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