package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_b_p_j_s_zakat_sehat_h.*
import kotlinx.android.synthetic.main.activity_s_u_k_s_e_s1.*

class SUKSES1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_u_k_s_e_s1)

        val intent = getIntent()
        val totalHitung = intent.getDoubleExtra("totalHitung", 0.0)
     //   sumPoint.text =totalHitung
        val button = findViewById<Button>(R.id.buttonSukses1Selanjutnya)
        button.setOnClickListener {

           // val totalHitung = resultSumPenghasilan.text.toString().toDouble()
            val intent = Intent(this, SUKSES2::class.java )
            intent.putExtra("totalHitung", totalHitung)
            startActivity(intent)
        }
    }
}