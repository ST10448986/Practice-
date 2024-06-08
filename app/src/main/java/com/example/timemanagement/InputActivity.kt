package com.example.timemanagement

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.NumberFormatException

class InputActivity : AppCompatActivity() {
    private lateinit var etDay: EditText
    private lateinit var etMorning: EditText
    private lateinit var etAfternoon: EditText
    private lateinit var etNotes: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonDisplay: Button

    private  val dayList = mutableListOf<String>()
    private  val afternoonList = mutableListOf<Float>()
    private  val morningList = mutableListOf<Float>()
    private  val notesList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_input)


        etDay = findViewById(R.id.etDay)
        etMorning = findViewById(R.id.etMorning)
        etAfternoon= findViewById(R.id.etAfternoon)
        etNotes = findViewById(R.id.etNotes)
        buttonSave = findViewById(R.id.buttonSave)
        buttonClear = findViewById(R.id.buttonClear)
        buttonDisplay = findViewById(R.id.buttonDisplay)

        buttonClear.setOnClickListener {
            etDay.setText("")
            etMorning.setText("")
            etAfternoon.setText("")
            etNotes.setText("")
        }
        buttonSave.setOnClickListener {
            val realday = etDay.text.toString()
            val realmorning = etMorning.text.toString()
            val realafternoon = etAfternoon.text.toString()
            val realnotes = etNotes.text.toString()
            if (realday.isNotEmpty()&& realmorning.isNotEmpty()&&realafternoon.isNotEmpty()){
                try {
                dayList.add(realday)
                morningList.add(realmorning.toFloat())
                afternoonList.add(realafternoon.toFloat())
                notesList.add(realnotes)
                etDay.setText("")
                etMorning.setText("")
                etAfternoon.setText("")
                etNotes.setText("")
                    }
                catch (e: NumberFormatException){

                }

            }
        }

        buttonDisplay.setOnClickListener {
            val intent2= Intent(this,DisplayActivity::class.java)
            intent2.putExtra("dayArray",dayList.toTypedArray())
            intent2.putExtra("morningArray",morningList.toTypedArray())
            intent2.putExtra("afternoonArray",afternoonList.toTypedArray())
            intent2.putExtra("notesArray",notesList.toTypedArray())
            startActivity(intent2)


        }


    }
}