package com.marcioz.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultB: Int = 0
        var resultL: Int = 0

        btnVoteBolsonaro.setOnClickListener {
            resultB++
            takeResult(resultB, resultL)
             }

        btnVoteLula.setOnClickListener {
            resultL++
            takeResult(resultB, resultL)
              }
    }

    fun takeResult(count1: Int, count2: Int){
        txtResult.text = "For now Bolsonaro has $count1 of valid votes and  Lula has $count2 of valid votes. "
    }
    }





