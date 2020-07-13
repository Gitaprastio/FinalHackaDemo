package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class BPJSActivityZakatMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_p_j_s_zakat_menu)

        val button = findViewById<Button>(R.id.buttonzakatsehat)
        button.setOnClickListener {
            val intent = Intent(this, BPJSZakatSehatH::class.java )
            startActivity(intent)
        }
    }
}