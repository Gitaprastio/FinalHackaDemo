package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_b_p_j_s_zakat_sehat_t.*

class BPJSZakatSehatT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_p_j_s_zakat_sehat_t)

        val intent = getIntent()
        val totalHitung = intent.getDoubleExtra("totalHitung", 0.0)
        val totalPenghasilan = intent.getDoubleExtra("totalPenghasilan", 0.0)
        totalBayar.text ="Periode                               : Juli"+"\nPenghasilan kena zakat   : "+totalPenghasilan+"\nZakat (2,5%)                       : "+totalHitung
        sumSaudaraTertolong.text=" 5 Saudara Yang Tertolong"


        val button = findViewById<Button>(R.id.buttonBayarZakat)
        button.setOnClickListener {
            val intent = Intent(this, SUKSES1::class.java )
           // intent.putExtra("totalHitung", totalHitung)
            startActivity(intent)
        }

    }
}