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
    var firstRowCardSuit = ""
    var secondRowCardSuit = ""
    var thirdRowCardSuit = ""
    var forthRowCardSuit = ""
    var randomCardSuit = ""

    var btnHigher = true
    var btnLower = true
    var choice: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val choiceFromStart = intent.getIntExtra("choice", choice)

        choice = choiceFromStart
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
            if (choice == 1) {
                buttonHigher.text = "Higher"
                buttonLower.text = "Lower"
            } else if (choice == 2) {
                buttonHigher.text = "Same color"
                buttonLower.text = "Not same"
            } else if (choice == 3) {
                randomCardButton.visibility = View.INVISIBLE
                buttonHigher.text = "Red"
                buttonLower.text = "Black"

            }
            buttonLower.visibility = View.VISIBLE
            buttonHigher.visibility = View.VISIBLE
            randomCardValue = cardRandom.value
            randomCardSuit = cardRandom.color
            enableFirstRow()


        }
        buttonHigher.setOnClickListener {
            btnHigher = false
        }
        buttonLower.setOnClickListener {
            btnLower = false
        }


        bottomCard1.setOnClickListener {

            bottomCard1.setImageResource(card1.image)
            firstRowCardValue = card1.value
            firstRowCardSuit = card1.color
            disableFirstRow()
            checkButtonFirst()


        }
        bottomCard2.setOnClickListener {

            bottomCard2.setImageResource(card1.image)
            firstRowCardValue = card1.value
            firstRowCardSuit = card1.color
            disableFirstRow()
            checkButtonFirst()


        }
        bottomCard3.setOnClickListener {
            bottomCard3.setImageResource(card1.image)
            firstRowCardValue = card1.value
            firstRowCardSuit = card1.color
            disableFirstRow()
            checkButtonFirst()


        }
        bottomCard4.setOnClickListener {

            bottomCard4.setImageResource(card1.image)
            firstRowCardValue = card1.value
            firstRowCardSuit = card1.color
            disableFirstRow()
            checkButtonFirst()


        }


        secondCard1.setOnClickListener {

            secondCard1.setImageResource(card2.image)
            secondRowCardValue = card2.value
            secondRowCardSuit = card2.color
            disableSecondRow()
            checkButtonSecond()


        }
        secondCard2.setOnClickListener {
            secondCard2.setImageResource(card2.image)
            secondRowCardValue = card2.value
            secondRowCardSuit = card2.color
            disableSecondRow()
            checkButtonSecond()


        }
        secondCard3.setOnClickListener {

            secondCard3.setImageResource(card2.image)
            secondRowCardValue = card2.value
            secondRowCardSuit = card2.color
            disableSecondRow()
            checkButtonSecond()

        }
        secondCard4.setOnClickListener {
            secondCard4.setImageResource(card2.image)
            secondRowCardValue = card2.value
            secondRowCardSuit = card2.color
            disableSecondRow()
            checkButtonSecond()


        }
        thirdCard1.setOnClickListener {

            thirdCard1.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            thirdRowCardSuit = card3.color
            disableThirdRow()
            checkButtonThird()


        }
        thirdCard2.setOnClickListener {

            thirdCard2.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            thirdRowCardSuit = card3.color
            disableThirdRow()
            checkButtonThird()


        }
        thirdCard3.setOnClickListener {

            thirdCard3.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            thirdRowCardSuit = card3.color
            disableThirdRow()
            checkButtonThird()


        }
        thirdCard4.setOnClickListener {

            thirdCard4.setImageResource(card3.image)
            thirdRowCardValue = card3.value
            thirdRowCardSuit = card3.color
            disableThirdRow()
            checkButtonThird()


        }
        forthCard1.setOnClickListener {

            forthCard1.setImageResource(card4.image)
            forthRowCardValue = card4.value
            forthRowCardSuit = card4.color
            disableForthRow()
            checkButtonForth()


        }
        forthCard2.setOnClickListener {

            forthCard2.setImageResource(card4.image)
            forthRowCardValue = card4.value
            forthRowCardSuit = card4.color
            disableForthRow()
            checkButtonForth()


        }
        forthCard3.setOnClickListener {

            forthCard3.setImageResource(card4.image)
            forthRowCardValue = card4.value
            forthRowCardSuit = card4.color
            disableForthRow()
            checkButtonForth()


        }
        forthCard4.setOnClickListener {

            forthCard4.setImageResource(card4.image)
            forthRowCardValue = card4.value
            forthRowCardSuit = card4.color
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

    fun enableFirstRow() {
        bottomCard1.isEnabled = true
        bottomCard2.isEnabled = true
        bottomCard3.isEnabled = true
        bottomCard4.isEnabled = true
    }

    fun enableSecondRow() {
        secondCard1.isEnabled = true
        secondCard2.isEnabled = true
        secondCard3.isEnabled = true
        secondCard4.isEnabled = true
    }

    fun enableThirdRow() {
        thirdCard1.isEnabled = true
        thirdCard2.isEnabled = true
        thirdCard3.isEnabled = true
        thirdCard4.isEnabled = true
    }

    fun enableForthRow() {
        forthCard1.isEnabled = true
        forthCard2.isEnabled = true
        forthCard3.isEnabled = true
        forthCard4.isEnabled = true
    }

    fun checkHigherFirstRow() { //higher or same color
        if (choice == 1) {
            if (randomCardValue < firstRowCardValue) {
                enableSecondRow()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {
            if (randomCardSuit == firstRowCardSuit) {
                enableSecondRow()
            } else {
                startLooseIntent()
            }
        }


    }

    fun checkLowerFirstRow() { // lower or not same color
        if (choice == 1) {
            if (randomCardValue > firstRowCardValue) {
                enableSecondRow()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {

            if (randomCardSuit != firstRowCardSuit) {
                enableSecondRow()
            } else {
                startLooseIntent()
            }
        }
    }

    fun checkHigherSecondRow() { //higher or same color
        if (choice == 1) {
            if (firstRowCardValue < secondRowCardValue) {
                enableThirdRow()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {
            if (firstRowCardSuit == secondRowCardSuit) {
                enableThirdRow()
            } else {
                startLooseIntent()
            }

        }

    }

    fun checkLowerSecondRow() {
        if (choice == 1) {
            if (firstRowCardValue > secondRowCardValue) {
                enableThirdRow()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {
            if (firstRowCardSuit != secondRowCardSuit) {
                enableThirdRow()
            } else {
                startLooseIntent()
            }
        }

    }

    fun checkHigherThirdRow() {
        if (choice == 1) {
            if (secondRowCardValue < thirdRowCardValue) {
                enableForthRow()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {
            if (secondRowCardSuit == thirdRowCardSuit) {
                enableForthRow()
            } else {
                startLooseIntent()
            }

        }

    }

    fun checkLowerThirdRow() {
        if (choice == 1) {
            if (secondRowCardValue > thirdRowCardValue) {
                enableForthRow()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {
            if (secondRowCardSuit != thirdRowCardSuit) {
                enableForthRow()
            } else {
                startLooseIntent()
            }
        }
    }

    fun checkWinHigher() {
        if (choice == 1) {
            if (thirdRowCardValue < forthRowCardValue) {
                startWinIntent()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {
            if (thirdRowCardSuit == forthRowCardSuit) {
                startWinIntent()
            } else {
                startLooseIntent()
            }

        }

    }

    fun checkWinLower() {
        if (choice == 1) {
            if (thirdRowCardValue > forthRowCardValue) {
                startWinIntent()
            } else {
                startLooseIntent()
            }
        } else if (choice == 2) {
            if (thirdRowCardSuit != forthRowCardSuit) {
                startWinIntent()
            } else {
                startLooseIntent()
            }
        }
    }

    fun checkButtonFirst() {
        if (choice == 3) {
            if (!btnHigher && firstRowCardSuit == "R") {
                btnHigher = true
                enableSecondRow()
            } else if (!btnLower && firstRowCardSuit == "B") {
                btnLower = true
                enableSecondRow()
            } else {
                startLooseIntent()
            }
        } else {
            if (!btnHigher) {
                btnHigher = true
                checkHigherFirstRow()
            } else if (!btnLower) {
                btnLower = true
                checkLowerFirstRow()
            }
        }
    }

    fun checkButtonSecond() {
        if (choice == 3) {
            if (!btnHigher && secondRowCardSuit == "R") {
                btnHigher = true
                enableThirdRow()
            } else if (!btnLower && secondRowCardSuit == "B") {
                btnLower = true
                enableThirdRow()
            } else {
                startLooseIntent()
            }
        } else {
            if (!btnHigher) {
                btnHigher = true
                checkHigherSecondRow()
            } else if (!btnLower) {
                btnLower = true
                checkLowerSecondRow()
            }
        }
    }

    fun checkButtonThird() {
        if (choice == 3) {
            if (!btnHigher && thirdRowCardSuit == "R") {
                btnHigher = true
                enableForthRow()
            } else if (!btnLower && thirdRowCardSuit == "B") {
                btnLower = true
                enableForthRow()
            } else {
                startLooseIntent()
            }
        } else {
            if (!btnHigher) {
                btnHigher = true
                checkHigherThirdRow()
            } else if (!btnLower) {
                btnLower = true
                checkLowerThirdRow()
            }
        }

    }

    fun checkButtonForth() {
        if (choice == 3) {
            if (!btnHigher && forthRowCardSuit == "R") {
                btnHigher = true
                startWinIntent()
            } else if (!btnLower && forthRowCardSuit == "B") {
                btnLower = true
                startWinIntent()
            } else {
                startLooseIntent()
            }
        } else {
            if (!btnHigher) { //left button
                btnHigher = true
                checkWinHigher()
            } else if (!btnLower) {//right button
                btnLower = true
                checkWinLower()
            }


        }

    }

    fun startWinIntent() {
        val intent = Intent(this, CorrectActivity::class.java)
        finish()
        startActivity(intent)
    }

    fun startLooseIntent() {
        val intent = Intent(this, LooseActivity::class.java)
        finish()
        startActivity(intent)
    }
}


