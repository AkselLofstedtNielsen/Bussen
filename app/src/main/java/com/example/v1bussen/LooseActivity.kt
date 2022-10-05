package com.example.v1bussen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LooseActivity : AppCompatActivity() {
    lateinit var looseButton: Button
    lateinit var gameOver: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loose)

        looseButton = findViewById(R.id.looseButton)
        gameOver = findViewById(R.id.gameOver)
        looseButton.setOnClickListener {
            val intent = Intent(this, StartScreen::class.java)
            finish()
            startActivity(intent)
        }
    }
}