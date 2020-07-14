package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class SuksesPremi2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_premi2)

        val button= findViewById<Button>(R.id.buttonSuksesPremi2)
        button.setOnClickListener {
            val intent = Intent(this, RaningFinalDemo::class.java )
            startActivity(intent)
        }
    }
}