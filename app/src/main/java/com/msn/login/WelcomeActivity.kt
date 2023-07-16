package com.msn.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.ListView

class WelcomeActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextTime: EditText
    private lateinit var buttonSubmit: Button
    private lateinit var dataList:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        editTextName = findViewById(R.id.editTextName)
        editTextTime = findViewById(R.id.editTextTime)
        buttonSubmit = findViewById(R.id.buttonSubmit)
        dataList=ArrayList()
        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val time = editTextTime.text.toString()
            val data = "اسم: $name, الوقت: $time"
            dataList.add(data)

            val intent = Intent(this, List::class.java)
            intent.putStringArrayListExtra("dataList", dataList)
            startActivity(intent)

            finish()
        }
    }
}

