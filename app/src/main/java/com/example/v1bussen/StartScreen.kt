package com.example.v1bussen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class StartScreen : AppCompatActivity() {

    lateinit var playButton1 :Button
    lateinit var playButton2 :Button
    lateinit var playButton3 :Button
    lateinit var htpButton :Button
    lateinit var busImage : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        var choice = 0

        busImage = findViewById(R.id.imageView)
        playButton1 = findViewById(R.id.playButton1)
        playButton2 = findViewById(R.id.playButton2)
        playButton3 = findViewById(R.id.playButton3)
        htpButton = findViewById(R.id.HtpButton)



        playButton1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            choice = 1
            intent.putExtra("choice",choice)
            startActivity(intent)
        }
        playButton2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            choice = 2
            intent.putExtra("choice",choice)
            startActivity(intent)
        }
        playButton3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            choice = 3
            intent.putExtra("choice",choice)
            startActivity(intent)
        }
        htpButton.setOnClickListener {
            val intent = Intent(this,htpActivity::class.java)
            startActivity(intent)
        }
    }
}