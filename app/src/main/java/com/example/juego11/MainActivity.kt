package com.example.juego11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnIniciar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIniciar = findViewById(R.id.btnComenzar)

        btnIniciar.setOnClickListener {
            val abrirJuego = Intent(this, JuegoActivity::class.java)
            startActivity(abrirJuego)
        }
    }
}