package com.example.timemanagement

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DisplayActivity : AppCompatActivity() {
    private lateinit var tvDay: TextView
    private lateinit var tvMorning: TextView
    private lateinit var tvAfternoon: TextView
    private lateinit var tvNotes: TextView
    private lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display)
        tvDay = findViewById(R.id.textviewDay)
        tvMorning = findViewById(R.id.textviewMorning)
        tvAfternoon= findViewById(R.id.textviewAfternoon)
        tvNotes = findViewById(R.id.textviewNote)
        buttonBack = findViewById(R.id.buttonBack)

        val arrayDay = intent.getStringArrayExtra("dayArray")?.toList()?: emptyList()
        val arrayMorning = intent.getFloatArrayExtra("morningArray")?.toList()?: emptyList()
        val arrayAfternoon = intent.getFloatArrayExtra("afternoonArray")?.toList()?: emptyList()
        val arrayNotes = intent.getStringArrayExtra("notesArray")?.toList()?: emptyList()

        var dayed = StringBuilder()
        for ((index, day) in arrayDay.withIndex()){
            dayed.append("Day: ${index} : $day")
        }
        var morning = StringBuilder()
        for ((index, time) in arrayMorning.withIndex()){
            dayed.append("time: ${index} : $time")
        }
        var afternoon = StringBuilder()
        for ((index, time) in arrayAfternoon.withIndex()){
            dayed.append("time: ${index} : $time")
        }
        var Notes = StringBuilder()
        for ((index, time) in arrayNotes.withIndex()){
            dayed.append("time: ${index} : $time")
        }




    }
}