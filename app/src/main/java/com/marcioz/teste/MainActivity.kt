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
            Toast.makeText(this, "Bolsonaro tem $resultB votos e o Lula tem $resultL votos", Toast.LENGTH_SHORT).show()
        }

        btnVoteLula.setOnClickListener {
            resultL++
            Toast.makeText(this, "Bolsonaro tem $resultB votos e o Lula tem $resultL votos", Toast.LENGTH_SHORT).show()
        }



    }
    }





