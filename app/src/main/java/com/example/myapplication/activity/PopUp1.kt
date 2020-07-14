package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class PopUp1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up1)


        val button = findViewById<Button>(R.id.buttonManfaat)
        button.setOnClickListener {
            val intent = Intent(this, PopUp2::class.java )
            startActivity(intent)
        }

    }
}