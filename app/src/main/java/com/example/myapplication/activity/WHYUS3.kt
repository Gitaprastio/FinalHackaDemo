package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class WHYUS3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_w_h_y_u_s3)

        val button = findViewById<Button>(R.id.lanjutkan3)
        button.setOnClickListener {
            val intent = Intent(this, BPJSZakatSehatH::class.java )
            startActivity(intent)
        }
    }
}