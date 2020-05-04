package com.example.kotlin199

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

import com.example.kotlin199.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)

        val quizButton = findViewById<Button>(R.id.quizButton)
        quizButton.setOnClickListener { v ->
            val x = Intent(this, QuizActivity ::class.java)
            startActivity(x)
            finish()
        }
        val learnButton = findViewById<Button>(R.id.learnButton)
        learnButton.setOnClickListener { v ->
            val x = Intent(this, LearnActivity2::class.java)
            startActivity(x)
            finish()
        }
    }







    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }
}
