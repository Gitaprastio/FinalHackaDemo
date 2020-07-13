package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class WHYUS2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_w_h_y_u_s2)

        val button = findViewById<Button>(R.id.lanjutkan2)
        button.setOnClickListener {
            val intent = Intent(this, WHYUS3::class.java )
            startActivity(intent)
        }
    }
}