package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class DonasiPremiTunggal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donasi_premi_tunggal)


        val buttonpremiswitch= findViewById<Button>(R.id.buttonTunggalBayarC)
        buttonpremiswitch.setOnClickListener {
            val intent = Intent(this, DonasiPremiRutin::class.java )
            startActivity(intent)
        }



    }
}