package com.example.v1bussen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var deck = mutableListOf<Card>()

        for (hearts in 1..13) {
            var newCard = Card(hearts, "H", false, R.drawable.Joker)
            deck.add(newCard)
        }
        for (spades in 1..13) {
            var newCard = Card(spades, "S", false, R.drawable.Joker)
            deck.add(newCard)
        }
        for (clubs in 1..13) {
            var newCard = Card(clubs, "C", false, R.drawable.Joker)
            deck.add(newCard)
        }
        for (diamonds in 1..13) {
            var newCard = Card(diamonds, "D", false, R.drawable.Joker)
            deck.add(newCard)
        }

        for (cards in deck){
              Log.d("!!!","HEjsan")
        }
    }
}


