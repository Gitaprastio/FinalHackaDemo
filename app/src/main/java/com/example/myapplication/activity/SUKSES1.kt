package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class SUKSES1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_u_k_s_e_s1)

//        val intent = getIntent()
//        val totalHitung = intent.getDoubleExtra("totalHitung", 0.0)
        val button = findViewById<Button>(R.id.buttonSukses1Selanjutnya)
        button.setOnClickListener {
            val intent = Intent(this, SUKSES2::class.java )
//            intent.putExtra("totalHitung", totalHitung)
          startActivity(intent)
        }
    }
}