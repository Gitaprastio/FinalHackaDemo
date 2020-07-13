package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class RaningFinalDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raning_final_demo)

        val button= findViewById<Button>(R.id.buttonfinals)
        button.setOnClickListener {
            val intent = Intent(this, FinalHomePage::class.java )
            startActivity(intent)
        }
    }
}