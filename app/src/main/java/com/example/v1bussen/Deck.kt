package com.example.v1bussen

class Deck {
    var deck = mutableListOf<Card>()

    init {
        initializeDeck()
    }

    fun getCard(): Card {

        var rnd = 0
        val randomCard = (0 until deck.size).shuffled()
        val card = deck.removeAt(randomCard[rnd])
        rnd++
        return card
    }

    fun initializeDeck() {

        deck.add(Card(R.drawable.h1, 1, "R"))
        deck.add(Card(R.drawable.h2, 2, "R"))
        deck.add(Card(R.drawable.h3, 3, "R"))
        deck.add(Card(R.drawable.h4, 4, "R"))
        deck.add(Card(R.drawable.h5, 5, "R"))
        deck.add(Card(R.drawable.h6, 6, "R"))
        deck.add(Card(R.drawable.h7, 7, "R"))
        deck.add(Card(R.drawable.h8, 8, "R"))
        deck.add(Card(R.drawable.h9, 9, "R"))
        deck.add(Card(R.drawable.h10, 10, "R"))
        deck.add(Card(R.drawable.h11, 11, "R"))
        deck.add(Card(R.drawable.h12, 12, "R"))
        deck.add(Card(R.drawable.h13, 13, "R"))

        deck.add(Card(R.drawable.s1, 1, "B"))
        deck.add(Card(R.drawable.s2, 2, "B"))
        deck.add(Card(R.drawable.s3, 3, "B"))
        deck.add(Card(R.drawable.s4, 4, "B"))
        deck.add(Card(R.drawable.s5, 5, "B"))
        deck.add(Card(R.drawable.s6, 6, "B"))
        deck.add(Card(R.drawable.s7, 7, "B"))
        deck.add(Card(R.drawable.s8, 8, "B"))
        deck.add(Card(R.drawable.s9, 9, "B"))
        deck.add(Card(R.drawable.s10, 10, "B"))
        deck.add(Card(R.drawable.s11, 11, "B"))
        deck.add(Card(R.drawable.s12, 12, "B"))
        deck.add(Card(R.drawable.s13, 13, "B"))

        deck.add(Card(R.drawable.r1, 1, "R"))
        deck.add(Card(R.drawable.r2, 2, "R"))
        deck.add(Card(R.drawable.r3, 3, "R"))
        deck.add(Card(R.drawable.r4, 4, "R"))
        deck.add(Card(R.drawable.r5, 5, "R"))
        deck.add(Card(R.drawable.r6, 6, "R"))
        deck.add(Card(R.drawable.r7, 7, "R"))
        deck.add(Card(R.drawable.r8, 8, "R"))
        deck.add(Card(R.drawable.r9, 9, "R"))
        deck.add(Card(R.drawable.r10, 10, "R"))
        deck.add(Card(R.drawable.r11, 11, "R"))
        deck.add(Card(R.drawable.r12, 12, "R"))
        deck.add(Card(R.drawable.r13, 13, "R"))

        deck.add(Card(R.drawable.c1, 1, "B"))
        deck.add(Card(R.drawable.c2, 2, "B"))
        deck.add(Card(R.drawable.c3, 3, "B"))
        deck.add(Card(R.drawable.c4, 4, "B"))
        deck.add(Card(R.drawable.c5, 5, "B"))
        deck.add(Card(R.drawable.c6, 6, "B"))
        deck.add(Card(R.drawable.c7, 7, "B"))
        deck.add(Card(R.drawable.c8, 8, "B"))
        deck.add(Card(R.drawable.c9, 9, "B"))
        deck.add(Card(R.drawable.c10, 10, "B"))
        deck.add(Card(R.drawable.c11, 11, "B"))
        deck.add(Card(R.drawable.c12, 12, "B"))
        deck.add(Card(R.drawable.c13, 13, "B"))
    }
}