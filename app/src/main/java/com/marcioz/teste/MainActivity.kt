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
        var count: Int = 1

        btnVoteBolsonaro.setOnClickListener {
            if(count % 3 == 0){resultL++
                count++}else{resultB++
                count++}
             }

        btnVoteLula.setOnClickListener {
            resultL++
            count++
              }
        btnResult.setOnClickListener {
            toResult(resultB, resultL)
        }

    }

    fun toResult(vote1: Int, vote2: Int){
        txtResult.text = "For now Bolsonaro has $vote1 valid votes and  Lula has $vote2 valid votes. "
    }
    }





