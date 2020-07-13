package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class FinalHomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_home_page)

        val buttondonasi= findViewById<Button>(R.id.buttonDonasi)
        buttondonasi.setOnClickListener {
            val intent = Intent(this, WHYUS1::class.java )
            startActivity(intent)
        }

        val buttonpremi= findViewById<Button>(R.id.buttonDonasiPremi)
        buttonpremi.setOnClickListener {
            val intent = Intent(this, DonasiPremiTunggal::class.java )
            startActivity(intent)
        }
    }
}