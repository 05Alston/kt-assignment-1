package com.example.kt_assignment_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class directionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direction_page)
        val btn: Button = findViewById(R.id.returnButton)

        btn.setOnClickListener() {
            val intent = Intent(this, endPage::class.java)
            startActivity(intent)
        }

    }
}