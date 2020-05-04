package com.example.kotlin199

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

import com.example.kotlin199.R

class LearnActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_activity)

        val asianartButton = findViewById<Button>(R.id.asianartButton)
        asianartButton.setOnClickListener { v ->
            val x = Intent(this, AsianartActivity::class.java)
            startActivity(x)
            finish()
        }

        val europeanButton = findViewById<Button>(R.id.europeanButton)
        europeanButton.setOnClickListener { v ->
            val x = Intent(this, EuropeanArtActivity::class.java)
            startActivity(x)
            finish()
        }


    }
}

