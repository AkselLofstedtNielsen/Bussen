package com.example.v1bussen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class StartScreen : AppCompatActivity() {


    var choice = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)


        val busImage = findViewById<ImageView>(R.id.imageView)
        val playButton1 = findViewById<Button>(R.id.playButton1)
        val playButton2 = findViewById<Button>(R.id.playButton2)
        val playButton3 = findViewById<Button>(R.id.playButton3)
        val htpButton = findViewById<Button>(R.id.HtpButton)



        playButton1.setOnClickListener {
            choice = 1
            startMainIntent()
        }
        playButton2.setOnClickListener {
            choice = 2
            startMainIntent()
        }
        playButton3.setOnClickListener {
            choice = 3
            startMainIntent()
        }
        htpButton.setOnClickListener {
            val intent = Intent(this, htpActivity::class.java)
            startActivity(intent)
        }
    }

    fun startMainIntent() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("choice", choice)
        finish()
        startActivity(intent)
    }
}