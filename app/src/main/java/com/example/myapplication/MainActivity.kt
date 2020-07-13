package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.activity.BPJSActivityZakatMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonDonasi)
        button.setOnClickListener {
            val intent = Intent(this, BPJSActivityZakatMenu::class.java )
            startActivity(intent)
        }

        val intent = getIntent()
        val totalHitung = intent.getDoubleExtra("totalHitung", 0.0)

        val currentScore:Double = 1000.0
        val  totalscore:Double = totalHitung+currentScore
        println(totalscore)
        }
    }


