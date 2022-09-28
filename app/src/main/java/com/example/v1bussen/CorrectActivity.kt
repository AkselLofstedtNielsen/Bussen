package com.example.v1bussen

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import nl.dionsegijn.konfetti.KonfettiView
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class CorrectActivity : AppCompatActivity() {

    lateinit var winButton: Button
    lateinit var konfettiView: KonfettiView
    lateinit var textView: TextView
    lateinit var playAgainButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct)


        konfettiView = findViewById(R.id.viewKonfetti)
        textView = findViewById(R.id.textView)
        winButton = findViewById(R.id.winButton)
        playAgainButton = findViewById(R.id.restartButton)
        winButton.text = "Click for prize!"
        textView.visibility = View.INVISIBLE

        winButton.setOnClickListener {
            textView.visibility = View.VISIBLE
            konfettiView.build()
                .addColors(Color.GREEN,Color.RED,Color.MAGENTA)
                .setDirection(0.0,359.0)
                .setSpeed(1f,5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.Square, Shape.Circle)
                .addSizes(Size(12))
                .setPosition(-50f,konfettiView.width+50f,-50f,-50f)
                .streamFor(300,3000L)
        }
        playAgainButton.setOnClickListener {
            val intent = Intent(this, StartScreen::class.java)
            startActivity(intent)
        }

    }
}