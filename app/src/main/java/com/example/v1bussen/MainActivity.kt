package com.example.v1bussen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    var btnHigher = true
    var btnLower = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val deck = Deck()
        val card1 = deck.getCard()
        val card2 = deck.getCard()
        val card3 = deck.getCard()
        val card4 = deck.getCard()
        val cardRandom = deck.getCard()

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



        disableFirstRow()
        disableSecondRow()
        disableThirdRow()
        disableForthRow()

        randomCardButton.setOnClickListener {

            randomCardButton.setImageResource(cardRandom.image)
            buttonLower.visibility = View.VISIBLE
            buttonHigher.visibility = View.VISIBLE
            randomCardValue = cardRandom.value
            bottomCard1.isEnabled = true
            bottomCard2.isEnabled = true
            bottomCard3.isEnabled = true
            bottomCard4.isEnabled = true


        }
        buttonHigher.setOnClickListener {
            btnHigher = false
        }
        buttonLower.setOnClickListener {
            btnLower = false
        }


        bottomCard1.setOnClickListener {

            //shuffled 1..52 int so its "random" but usable again inside the {}
            bottomCard1.setImageResource(card1.image)
            firstRowCardValue = card1.value
            disableFirstRow()
            checkButtonFirst()


        }
        bottomCard2.setOnClickListener {

            bottomCard2.setImageResource(card1.image)
            firstRowCardValue = card1.value
            disableFirstRow()
            checkButtonFirst()



        }
        bottomCard3.setOnClickListener {
            bottomCard3.setImageResource(card1.image)
            firstRowCardValue = card1.value
            disableFirstRow()
            checkButtonFirst()



        }
        bottomCard4.setOnClickListener {

            bottomCard4.setImageResource(card1.image)
            firstRowCardValue = card1.value
            disableFirstRow()
            checkButtonFirst()



        }


        secondCard1.setOnClickListener {

            secondCard1.setImageResource(card2.image)
            secondRowCardValue = card2.value
            disableSecondRow()
            checkButtonSecond()


        }
        secondCard2.setOnClickListener {
            secondCard2.setImageResource(card2.image)
            secondRowCardValue = card2.value
            disableSecondRow()
            checkButtonSecond()


        }
        secondCard3.setOnClickListener {

            secondCard3.setImageResource(card2.image)
            secondRowCardValue = card2.value
            disableSecondRow()
            checkButtonSecond()

        }
        secondCard4.setOnClickListener {
            secondCard4.setImageResource(card2.image)
            secondRowCardValue = card2.value
            disableSecondRow()
            checkButtonSecond()


        }
        thirdCard1.setOnClickListener {

            thirdCard1.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            disableThirdRow()
            checkButtonThird()


        }
        thirdCard2.setOnClickListener {

            thirdCard2.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            disableThirdRow()
            checkButtonThird()


        }
        thirdCard3.setOnClickListener {

            thirdCard3.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            disableThirdRow()
            checkButtonThird()


        }
        thirdCard4.setOnClickListener {

            thirdCard4.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            disableThirdRow()
            checkButtonThird()


        }
        forthCard1.setOnClickListener {

            forthCard1.setImageResource(card4.image)
            forthRowCardValue = card4.value
            disableForthRow()
            checkButtonForth()


        }
        forthCard2.setOnClickListener {

            forthCard2.setImageResource(card4.image)
            forthRowCardValue = card4.value
            disableForthRow()
            checkButtonForth()


        }
        forthCard3.setOnClickListener {

            forthCard3.setImageResource(card4.image)
            forthRowCardValue = card4.value
            disableForthRow()
            checkButtonForth()


        }
        forthCard4.setOnClickListener {

            forthCard4.setImageResource(card4.image)
            forthRowCardValue = card4.value
            disableForthRow()
            checkButtonForth()


        }


    }

    fun disableFirstRow() {
        bottomCard1.isEnabled = false
        bottomCard2.isEnabled = false
        bottomCard3.isEnabled = false
        bottomCard4.isEnabled = false
    }

    fun disableSecondRow() {
        secondCard1.isEnabled = false
        secondCard2.isEnabled = false
        secondCard3.isEnabled = false
        secondCard4.isEnabled = false
    }

    fun disableThirdRow() {
        thirdCard1.isEnabled = false
        thirdCard2.isEnabled = false
        thirdCard3.isEnabled = false
        thirdCard4.isEnabled = false
    }

    fun disableForthRow() {
        forthCard1.isEnabled = false
        forthCard2.isEnabled = false
        forthCard3.isEnabled = false
        forthCard4.isEnabled = false
    }

    fun checkHigherFirstRow() {
        if (randomCardValue < firstRowCardValue ) {
            secondCard1.isEnabled = true
            secondCard2.isEnabled = true
            secondCard3.isEnabled = true
            secondCard4.isEnabled = true
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }

    }
    fun checkLowerFirstRow() {
        if (randomCardValue > firstRowCardValue) {
            secondCard1.isEnabled = true
            secondCard2.isEnabled = true
            secondCard3.isEnabled = true
            secondCard4.isEnabled = true
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }
    }

    fun checkHigherSecondRow() {
        if (firstRowCardValue < secondRowCardValue) {
            thirdCard1.isEnabled = true
            thirdCard2.isEnabled = true
            thirdCard3.isEnabled = true
            thirdCard4.isEnabled = true
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }
    }
    fun checkLowerSecondRow() {
        if (firstRowCardValue > secondRowCardValue) {
            thirdCard1.isEnabled = true
            thirdCard2.isEnabled = true
            thirdCard3.isEnabled = true
            thirdCard4.isEnabled = true
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }
    }

    fun checkHigherThirdRow() {
        if (secondRowCardValue < thirdRowCardValue) {
            forthCard1.isEnabled = true
            forthCard2.isEnabled = true
            forthCard3.isEnabled = true
            forthCard4.isEnabled = true
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }
    }
    fun checkLowerThirdRow() {
        if (secondRowCardValue > thirdRowCardValue) {
            forthCard1.isEnabled = true
            forthCard2.isEnabled = true
            forthCard3.isEnabled = true
            forthCard4.isEnabled = true
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }
    }
    fun checkWinHigher(){
        if (thirdRowCardValue < forthRowCardValue) {
            val intent = Intent(this, CorrectActivity::class.java)
            startActivity(intent)
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }
    }
    fun checkWinLower(){
        if (thirdRowCardValue > forthRowCardValue) {
            val intent = Intent(this, CorrectActivity::class.java)
            startActivity(intent)
        }
        else {
            val intent = Intent(this, LooseActivity::class.java)
            startActivity(intent)
        }
    }
    fun checkButtonFirst(){
        if(btnHigher == false){
            btnHigher = true
            checkHigherFirstRow()
        }
        else if (btnLower == false){
            btnLower = true
            checkLowerFirstRow()
        }
    }
    fun checkButtonSecond(){
        if(btnHigher == false){
            btnHigher = true
            checkHigherSecondRow()
        }
        else if (btnLower == false){
            btnLower = true
            checkLowerSecondRow()
        }
    }
    fun checkButtonThird(){
        if(btnHigher == false){
            btnHigher = true
            checkHigherThirdRow()
        }
        else if (btnLower == false){
            btnLower = true
            checkLowerThirdRow()
        }
    }
    fun checkButtonForth(){
        if(btnHigher == false){
            btnHigher = true
            checkWinHigher()
        }
        else if (btnLower == false){
            btnLower = true
            checkWinLower()
        }
    }



}


