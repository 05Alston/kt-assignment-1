package com.example.kt_assignment_1

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class endPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_page)
        val btn: Button = findViewById(R.id.returnButton)
        val btn1: Button = findViewById(R.id.exitButton)
        btn.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn1.setOnClickListener() {
            this.finishAffinity();
        }

    }
}