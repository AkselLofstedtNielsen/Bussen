package com.example.v1bussen

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var randomCardButton: ImageButton
    lateinit var bottomCard1: ImageButton
    lateinit var bottomCard2: ImageButton
    lateinit var bottomCard3: ImageButton
    lateinit var bottomCard4: ImageButton

    val cardImages: IntArray = intArrayOf(
        R.drawable.h1,
        R.drawable.h2,
        R.drawable.h3,
        R.drawable.h4,
        R.drawable.h5,
        R.drawable.h6,
        R.drawable.h7,
        R.drawable.h8,
        R.drawable.h9,
        R.drawable.h10,
        R.drawable.h11,
        R.drawable.h12,
        R.drawable.h13,
        R.drawable.s1,
        R.drawable.s2,
        R.drawable.s3,
        R.drawable.s4,
        R.drawable.s5,
        R.drawable.s6,
        R.drawable.s7,
        R.drawable.s8,
        R.drawable.s9,
        R.drawable.s10,
        R.drawable.s11,
        R.drawable.s12,
        R.drawable.s13,
        R.drawable.r1,
        R.drawable.r2,
        R.drawable.r3,
        R.drawable.r4,
        R.drawable.r5,
        R.drawable.r6,
        R.drawable.r7,
        R.drawable.r8,
        R.drawable.r9,
        R.drawable.r10,
        R.drawable.r11,
        R.drawable.r12,
        R.drawable.r13,
        R.drawable.c1,
        R.drawable.c2,
        R.drawable.c3,
        R.drawable.c4,
        R.drawable.c5,
        R.drawable.c6,
        R.drawable.c7,
        R.drawable.c8,
        R.drawable.c9,
        R.drawable.c10,
        R.drawable.c11,
        R.drawable.c12,
        R.drawable.c13,


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomCardButton = findViewById(R.id.randomCardButton)
        bottomCard1 = findViewById(R.id.bottomCard1)
        bottomCard2 = findViewById(R.id.bottomCard2)
        bottomCard3 = findViewById(R.id.bottomCard3)
        bottomCard4 = findViewById(R.id.bottomCard4)

        randomCardButton.setOnClickListener{
            val random = Random
            randomCardButton.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }
        bottomCard1.setOnClickListener{
            val random = Random
            bottomCard1.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }
        bottomCard2.setOnClickListener{
            val random = Random
            bottomCard2.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }
        bottomCard3.setOnClickListener{
            val random = Random
            bottomCard3.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }
        bottomCard4.setOnClickListener{
            val random = Random
            bottomCard4.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }


    }


}