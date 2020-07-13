package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class Ranking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)



        val button = findViewById<Button>(R.id.buttonranking)
        button.setOnClickListener {
            val intent = Intent(this, PopUp1::class.java )
            startActivity(intent)
        }
    }
}