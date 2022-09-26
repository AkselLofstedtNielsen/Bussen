package com.example.v1bussen

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import nl.dionsegijn.konfetti.KonfettiView
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class CorrectActivity : AppCompatActivity() {

    lateinit var winButton: Button
    lateinit var konfettiView: KonfettiView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct)

        konfettiView = findViewById(R.id.viewKonfetti)
        winButton = findViewById(R.id.winButton)
        winButton.text = "Click for prize!"

        winButton.setOnClickListener {
            konfettiView.build()
                .addColors(Color.YELLOW,Color.GREEN,Color.MAGENTA)
                .setDirection(0.0,359.0)
                .setSpeed(1f,5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.Square, Shape.Circle)
                .addSizes(Size(12))
                .setPosition(-50f,konfettiView.width+50f,-50f,-50f)
                .streamFor(300,3000L)
        }

    }
}