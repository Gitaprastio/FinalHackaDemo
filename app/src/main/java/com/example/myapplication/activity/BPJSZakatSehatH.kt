package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_b_p_j_s_zakat_sehat_h.*
import java.math.BigDecimal

class BPJSZakatSehatH : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_p_j_s_zakat_sehat_h)

        penghasilan.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                add()
                println(resultSumPenghasilan)

            }
        })

        penghasilan.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                add()
              //  println(resultSumPenghasilan)

            }
        })

        penghasilan2.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                add()
             //   println(resultSumPenghasilan)

            }
        })

        penghasilan3.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                add()
              //  println(resultSumPenghasilan)

            }
        })

        penghasilan4.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                add()
             //   println(resultSumPenghasilan)

            }
        })

        val button = findViewById<Button>(R.id.buttonLanjutkanAfterAfterHitZakat)
        button.setOnClickListener {

            val totalHitung = resultSumPenghasilan.text.toString().toDouble()
            val totalPenghasilan = totalPenghasilan.text.toString().toDouble()
            val intent = Intent(this, BPJSZakatSehatT::class.java )
            intent.putExtra("totalHitung", totalHitung)
            intent.putExtra("totalPenghasilan", totalPenghasilan)

            startActivity(intent)
        }

    }




    fun add(){
        if (inputIsNotEmpty()){
            val input1 = penghasilan.text.toString().trim().toDouble()
            val input2 = penghasilan2.text.toString().trim().toDouble()
            val input3 = penghasilan3.text.toString().trim().toDouble()
            val input4 = penghasilan4.text.toString().trim().toDouble()
            val persen : Double = 0.025
            val totalpenghasilan :Double = input1+input2+input3+input4
            resultSumPenghasilan.text = (totalpenghasilan*persen).toString()
            totalPenghasilan.text=totalpenghasilan.toString()

        }

    }

    fun inputIsNotEmpty():Boolean {
        var b = true
        if (
            penghasilan.text.toString().trim().isEmpty()){
            penghasilan.error = "required"
            b = false
        }
        if (
            penghasilan2.text.toString().trim().isEmpty()){
            penghasilan2.error = "required"
            b = false
        }
        if (
            penghasilan3.text.toString().trim().isEmpty()){
            penghasilan3.error = "required"
            b = false
        }
        if (
            penghasilan4.text.toString().trim().isEmpty()){
            penghasilan4.error = "required"
            b = false
        }

        return b
    }
}