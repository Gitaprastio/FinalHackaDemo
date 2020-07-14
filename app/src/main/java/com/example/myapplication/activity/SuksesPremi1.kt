package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class SuksesPremi1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_premi1)

        val button= findViewById<Button>(R.id.buttonSuksesPremi)
        button.setOnClickListener {
            val intent = Intent(this, SuksesPremi2::class.java )
            startActivity(intent)
        }



    }
}