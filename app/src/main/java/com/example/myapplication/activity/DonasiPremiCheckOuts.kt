package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class DonasiPremiCheckOuts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donasi_premi_check_outs)



        val buttonbayar= findViewById<Button>(R.id.buttoncekoutP)
        buttonbayar.setOnClickListener {
            val intent = Intent(this, SuksesPremi1::class.java )
            startActivity(intent)
        }


    }


}