package com.example.kt_assignment_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.buttonPage1)
        btn.setOnClickListener() {
            val intent = Intent(this, infoPage::class.java)
            startActivity(intent)
        }
        fun quitApp(view: View) {
            this@MainActivity.finish()
            exitProcess(0)
        }

    }
}