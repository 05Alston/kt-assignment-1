package com.example.kt_assignment_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.*

class infoPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_page)
        val btn: Button = findViewById(R.id.buttonPage2)
        val eMail: EditText = findViewById(R.id.editTextTextEmailAddress)
        val epass: EditText = findViewById(R.id.editTextTextPassword)
        if(true){
            btn.setOnClickListener() {
                val intent = Intent(this, directionPage::class.java)
                startActivity(intent)
            }
        }
        val textView: TextView = findViewById(R.id.textView5)
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.setOnClickListener {
            val intent = Intent(this, registerPage::class.java)
            startActivity(intent)
        }
    }
}