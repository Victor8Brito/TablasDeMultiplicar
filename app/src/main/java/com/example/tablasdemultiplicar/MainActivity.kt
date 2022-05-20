package com.example.tablasdemultiplicar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPracticar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPracticar= findViewById(R.id.btnIrAPracticar)
        btnPracticar.setOnClickListener{
            val intentPracticar=Intent(this,PracticaActivity2::class.java)
            startActivity(intentPracticar)
        }
    }
}