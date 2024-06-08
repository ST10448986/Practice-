package com.example.timemanagement

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var btnNext: Button
    private lateinit var textView2: TextView
    private lateinit var buttonExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textview)
        buttonExit = findViewById(R.id.buttonexit)
        textView2 = findViewById(R.id.textview2)
        btnNext = findViewById(R.id.buttonNext)

        btnNext.setOnClickListener{

            val intent= Intent(this,InputActivity::class.java)
            startActivity(intent)
        }


    }
}