package com.example.kt_assignment_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class registerPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)
        val textView: TextView = findViewById(R.id.textView4)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.setOnClickListener {
            val intent = Intent(this, infoPage::class.java)
            startActivity(intent)
        }
        val btn: Button = findViewById(R.id.buttonPage)
        val userName: TextView = findViewById(R.id.editTextTextPersonName)
        btn.setOnClickListener() {
            Toast.makeText(this,"userName", Toast.LENGTH_SHORT).show();
        }
    }
}