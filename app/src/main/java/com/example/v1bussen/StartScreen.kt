package com.example.v1bussen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class StartScreen : AppCompatActivity() {

    lateinit var playButton :Button
    lateinit var htpButton :Button

    lateinit var HLButton :Button
    lateinit var RBButton :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        var choice = false


        playButton = findViewById(R.id.playButton)
        htpButton = findViewById(R.id.HtpButton)
        HLButton = findViewById(R.id.button1)
        RBButton = findViewById(R.id.button2)

        HLButton.setOnClickListener {
            choice = true
        }
        RBButton.setOnClickListener {
            choice = false
        }



        playButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("choice",choice)
            startActivity(intent)
        }
        htpButton.setOnClickListener {
            val intent = Intent(this,htpActivity::class.java)
            startActivity(intent)
        }
    }
}