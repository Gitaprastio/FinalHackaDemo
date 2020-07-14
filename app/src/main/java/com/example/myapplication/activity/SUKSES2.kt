package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class SUKSES2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_u_k_s_e_s2)

        val button = findViewById<Button>(R.id.buttonSukses2Selanjutnya)
        button.setOnClickListener {
            val intent = Intent(this, Ranking::class.java )
            startActivity(intent)
        }
    }
}