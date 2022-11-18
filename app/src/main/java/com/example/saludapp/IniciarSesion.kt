package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class IniciarSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)
        iniEvent()
        Continuar()
    }
    fun iniEvent(){

        val ImageView = findViewById<ImageView>(R.id.imageViewVolver)
        ImageView.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun Continuar(){

        val ImageView = findViewById<ImageView>(R.id.imageViewcontinuar)
        ImageView.setOnClickListener{
            val intent = Intent(this,MenuInicio::class.java)
            startActivity(intent)
        }
    }
}