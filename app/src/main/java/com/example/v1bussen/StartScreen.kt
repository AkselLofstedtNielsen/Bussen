package com.example.v1bussen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartScreen : AppCompatActivity() {

    lateinit var playButton :Button
    lateinit var htpButton :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        playButton = findViewById(R.id.playButton)
        htpButton = findViewById(R.id.HtpButton)

        playButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        htpButton.setOnClickListener {
            val intent = Intent(this,htpActivity::class.java)
            startActivity(intent)
        }
    }
}