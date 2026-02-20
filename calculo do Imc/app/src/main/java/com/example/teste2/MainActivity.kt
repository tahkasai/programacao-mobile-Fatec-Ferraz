package com.example.teste2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val editTextAltura = findViewById<TextView>(R.id.textViewAltura)
        val editTextPeso = findViewById<TextView>(R.id.textViewPeso)
        val resultado = findViewById<TextView>(R.id.textViewResultado)
        val buttoncalcular = findViewById<TextView>(R.id.buttoncalcular);

        buttoncalcular.setOnClickListener {
            val peso = editTextPeso.text.toString().toDouble();
            val altura = editTextAltura.text.toString().toDouble();

            val imc = peso / (altura * altura)

            resultado.text = imc
        }

    }
}