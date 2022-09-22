package com.example.v1bussen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    lateinit var randomCardButton: ImageButton
    lateinit var bottomCard1: ImageButton
    lateinit var bottomCard2: ImageButton
    lateinit var bottomCard3: ImageButton
    lateinit var bottomCard4: ImageButton
    lateinit var secondCard1: ImageButton
    lateinit var secondCard2: ImageButton
    lateinit var secondCard3: ImageButton
    lateinit var secondCard4: ImageButton
    lateinit var thirdCard1: ImageButton
    lateinit var thirdCard2: ImageButton
    lateinit var thirdCard3: ImageButton
    lateinit var thirdCard4: ImageButton
    lateinit var forthCard1: ImageButton
    lateinit var forthCard2: ImageButton
    lateinit var forthCard3: ImageButton
    lateinit var forthCard4: ImageButton
    lateinit var buttonLower: Button
    lateinit var buttonHigher: Button
    
    var firstRowCardValue = 0 //int of value for card picked in first row
    var secondRowCardValue = 0
    var thirdRowCardValue = 0
    var forthRowCardValue = 0
    var randomCardValue = 0
    val deckSize = 1..52

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val card1h = Card(R.drawable.h1, 1, "h")
        val card2h = Card(R.drawable.h2, 2, "h")
        val card3h = Card(R.drawable.h3, 3, "h")
        val card4h = Card(R.drawable.h4, 4, "h")
        val card5h = Card(R.drawable.h5, 5, "h")
        val card6h = Card(R.drawable.h6, 6, "h")
        val card7h = Card(R.drawable.h7, 7, "h")
        val card8h = Card(R.drawable.h8, 8, "h")
        val card9h = Card(R.drawable.h9, 9, "h")
        val card10h = Card(R.drawable.h11, 10, "h")
        val card11h = Card(R.drawable.h11, 11, "h")
        val card12h = Card(R.drawable.h12, 12, "h")
        val card13h = Card(R.drawable.h13, 13, "h")

        val card1s = Card(R.drawable.s1, 1, "s")
        val card2s = Card(R.drawable.s2, 2, "s")
        val card3s = Card(R.drawable.s3, 3, "s")
        val card4s = Card(R.drawable.s4, 4, "s")
        val card5s = Card(R.drawable.s5, 5, "s")
        val card6s = Card(R.drawable.s6, 6, "s")
        val card7s = Card(R.drawable.s7, 7, "s")
        val card8s = Card(R.drawable.s8, 8, "s")
        val card9s = Card(R.drawable.s9, 9, "s")
        val card10s = Card(R.drawable.s11, 10, "s")
        val card11s = Card(R.drawable.s11, 11, "s")
        val card12s = Card(R.drawable.s12, 12, "s")
        val card13s = Card(R.drawable.s13, 13, "s")

        val card1r = Card(R.drawable.r1, 1, "r")
        val card2r = Card(R.drawable.r2, 2, "r")
        val card3r = Card(R.drawable.r3, 3, "r")
        val card4r = Card(R.drawable.r4, 4, "r")
        val card5r = Card(R.drawable.r5, 5, "r")
        val card6r = Card(R.drawable.r6, 6, "r")
        val card7r = Card(R.drawable.r7, 7, "r")
        val card8r = Card(R.drawable.r8, 8, "r")
        val card9r = Card(R.drawable.r9, 9, "r")
        val card10r = Card(R.drawable.r11, 10, "r")
        val card11r = Card(R.drawable.r11, 11, "r")
        val card12r = Card(R.drawable.r12, 12, "r")
        val card13r = Card(R.drawable.r13, 13, "r")

        val card1c = Card(R.drawable.c1, 1, "c")
        val card2c = Card(R.drawable.c2, 2, "c")
        val card3c = Card(R.drawable.c3, 3, "c")
        val card4c = Card(R.drawable.c4, 4, "c")
        val card5c = Card(R.drawable.c5, 5, "c")
        val card6c = Card(R.drawable.c6, 6, "c")
        val card7c = Card(R.drawable.c7, 7, "c")
        val card8c = Card(R.drawable.c8, 8, "c")
        val card9c = Card(R.drawable.c9, 9, "c")
        val card10c = Card(R.drawable.c11, 10, "c")
        val card11c = Card(R.drawable.c11, 11, "c")
        val card12c = Card(R.drawable.c12, 12, "c")
        val card13c = Card(R.drawable.c13, 13, "c")

        val deck = mutableListOf<Card>(
            card1h,
            card2h,
            card3h,
            card4h,
            card5h,
            card6h,
            card7h,
            card8h,
            card9h,
            card10h,
            card11h,
            card12h,
            card13h,
            card1s,
            card2s,
            card3s,
            card4s,
            card5s,
            card6s,
            card7s,
            card8s,
            card9s,
            card10s,
            card11s,
            card12s,
            card13s,
            card1r,
            card2r,
            card3r,
            card4r,
            card5r,
            card6r,
            card7r,
            card8r,
            card9r,
            card10r,
            card11r,
            card12r,
            card13r,
            card1c,
            card2c,
            card3c,
            card4c,
            card5c,
            card6c,
            card7c,
            card8c,
            card9c,
            card10c,
            card11c,
            card12c,
            card13c
        )

        randomCardButton = findViewById(R.id.randomCardButton)
        
        bottomCard1 = findViewById(R.id.bottomCard1)
        bottomCard2 = findViewById(R.id.bottomCard2)
        bottomCard3 = findViewById(R.id.bottomCard3)
        bottomCard4 = findViewById(R.id.bottomCard4)
        
        secondCard1 = findViewById(R.id.secondCard1)
        secondCard2 = findViewById(R.id.secondCard2)
        secondCard3 = findViewById(R.id.secondCard3)
        secondCard4 = findViewById(R.id.secondCard4)
        
        thirdCard1 = findViewById(R.id.thirdCard1)
        thirdCard2 = findViewById(R.id.thirdCard2)
        thirdCard3 = findViewById(R.id.thirdCard3)
        thirdCard4 = findViewById(R.id.thirdCard4)
        
        forthCard1 = findViewById(R.id.forthCard1)
        forthCard2 = findViewById(R.id.forthCard2)
        forthCard3 = findViewById(R.id.forthCard3)
        forthCard4 = findViewById(R.id.forthCard4)
        
        buttonLower = findViewById(R.id.buttonLower)
        buttonHigher = findViewById(R.id.buttonHigher)
        
        buttonLower.visibility = View.INVISIBLE
        buttonHigher.visibility = View.INVISIBLE

        //int of value for card picked in first row

        randomCardButton.setOnClickListener {
            val random = (deckSize).shuffled().first()
            randomCardButton.setImageResource(deck[random].image)
            buttonLower.visibility = View.VISIBLE
            buttonHigher.visibility = View.VISIBLE
            randomCardValue = deck[random].value
            disableSecondRow()
            disableThirdRow()
            disableForthRow()

        }
        bottomCard1.setOnClickListener {
            val random = (deckSize).shuffled().first()//shuffled 1..52 int so its "random" but usable again inside the {}
            bottomCard1.setImageResource(deck[random].image)
            firstRowCardValue = deck[random].value
            disableFirstRow()
            checkFirstRow()


        }
        bottomCard2.setOnClickListener {
            val random = (deckSize).shuffled().first()
            bottomCard2.setImageResource(deck[random].image)
            firstRowCardValue = deck[random].value
            disableFirstRow()
            checkFirstRow()


        }
        bottomCard3.setOnClickListener {
            val random = (deckSize).shuffled().first()
            bottomCard3.setImageResource(deck[random].image)
            firstRowCardValue = deck[random].value
            disableFirstRow()
            checkFirstRow()


        }
        bottomCard4.setOnClickListener {
            val random = (deckSize).shuffled().first()
            bottomCard4.setImageResource(deck[random].image)
            firstRowCardValue = deck[random].value
            disableFirstRow()
            checkFirstRow()


        }


        secondCard1.setOnClickListener {
            val random = (deckSize).shuffled().first()
            secondCard1.setImageResource(deck[random].image)
            secondRowCardValue = deck[random].value
            disableSecondRow()
            checkSecondRow()


        }
        secondCard2.setOnClickListener {
            val random = (deckSize).shuffled().first()
            secondCard2.setImageResource(deck[random].image)
            secondRowCardValue = deck[random].value
            disableSecondRow()
            checkSecondRow()



        }
        secondCard3.setOnClickListener {
            val random = (deckSize).shuffled().first()
            secondCard3.setImageResource(deck[random].image)
            secondRowCardValue = deck[random].value
            disableSecondRow()
            checkSecondRow()



        }
        secondCard4.setOnClickListener {
            val random = (deckSize).shuffled().first()
            secondCard4.setImageResource(deck[random].image)
            secondRowCardValue = deck[random].value
            disableSecondRow()
            checkSecondRow()



        }
        thirdCard1.setOnClickListener {
            val random = (deckSize).shuffled().first()
            thirdCard1.setImageResource(deck[random].image)
            thirdRowCardValue = deck[random].value
            disableThirdRow()
            checkThirdRow()


        }
        thirdCard2.setOnClickListener {
            val random = (deckSize).shuffled().first()
            thirdCard2.setImageResource(deck[random].image)
            thirdRowCardValue = deck[random].value
            disableThirdRow()
            checkThirdRow()



        }
        thirdCard3.setOnClickListener {
            val random = (deckSize).shuffled().first()
            thirdCard3.setImageResource(deck[random].image)
            thirdRowCardValue = deck[random].value
            disableThirdRow()
            checkThirdRow()



        }
        thirdCard4.setOnClickListener {
            val random = (deckSize).shuffled().first()
            thirdCard4.setImageResource(deck[random].image)
            thirdRowCardValue = deck[random].value
            disableThirdRow()
            checkThirdRow()



        }
        forthCard1.setOnClickListener {
            val random = (deckSize).shuffled().first()
            forthCard1.setImageResource(deck[random].image)
            forthRowCardValue = deck[random].value
            disableForthRow()


        }
        forthCard2.setOnClickListener {
            val random = (deckSize).shuffled().first()
            forthCard2.setImageResource(deck[random].image)
            forthRowCardValue = deck[random].value
            disableForthRow()



        }
        forthCard3.setOnClickListener {
            val random = (deckSize).shuffled().first()
            forthCard3.setImageResource(deck[random].image)
            forthRowCardValue = deck[random].value
            disableForthRow()



        }
        forthCard4.setOnClickListener {
            val random = (deckSize).shuffled().first()
            forthCard4.setImageResource(deck[random].image)
            forthRowCardValue = deck[random].value
            disableForthRow()



        }

        }
    fun disableFirstRow() {
        bottomCard1.isEnabled = false
        bottomCard2.isEnabled = false
        bottomCard3.isEnabled = false
        bottomCard4.isEnabled = false
    }
    fun disableSecondRow(){
        secondCard1.isEnabled = false
        secondCard2.isEnabled = false
        secondCard3.isEnabled = false
        secondCard4.isEnabled = false
    }
    fun disableThirdRow(){
        thirdCard1.isEnabled = false
        thirdCard2.isEnabled = false
        thirdCard3.isEnabled = false
        thirdCard4.isEnabled = false
    }
    fun disableForthRow(){
        forthCard1.isEnabled = false
        forthCard2.isEnabled = false
        forthCard3.isEnabled = false
        forthCard4.isEnabled = false
    }
    fun checkFirstRow(){
        if (randomCardValue < firstRowCardValue){
            secondCard1.isEnabled = true
            secondCard2.isEnabled = true
            secondCard3.isEnabled = true
            secondCard4.isEnabled = true
        }
    }
    fun checkSecondRow(){
        if (firstRowCardValue < secondRowCardValue){
            thirdCard1.isEnabled = true
            thirdCard2.isEnabled = true
            thirdCard3.isEnabled = true
            thirdCard4.isEnabled = true
        }
    }
    fun checkThirdRow(){
        if(secondRowCardValue < thirdRowCardValue){
            forthCard1.isEnabled = true
            forthCard2.isEnabled = true
            forthCard3.isEnabled = true
            forthCard4.isEnabled = true
        }
    }


    }


