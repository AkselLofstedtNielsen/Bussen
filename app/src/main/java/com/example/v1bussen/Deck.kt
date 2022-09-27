package com.example.v1bussen

class Deck {
    var deck  = mutableListOf<Card>()

    init {
        initializeDeck()
    }

    fun getCard() : Card{

        var rnd = 0
        val randomCard = (0 until deck.size).shuffled()
        val card = deck.removeAt(randomCard[rnd])
        rnd ++
        return card
    }

    fun initializeDeck(){

        deck.add(Card(R.drawable.h1, 1, "h"))
        deck.add(Card(R.drawable.h2, 2, "h"))
        deck.add(Card(R.drawable.h3, 3, "h"))
        deck.add(Card(R.drawable.h4, 4, "h"))
        deck.add(Card(R.drawable.h5, 5, "h"))
        deck.add(Card(R.drawable.h6, 6, "h"))
        deck.add(Card(R.drawable.h7, 7, "h"))
        deck.add(Card(R.drawable.h8, 8, "h"))
        deck.add(Card(R.drawable.h9, 9, "h"))
        deck.add(Card(R.drawable.h11, 10, "h"))
        deck.add(Card(R.drawable.h11, 11, "h"))
        deck.add(Card(R.drawable.h12, 12, "h"))
        deck.add(Card(R.drawable.h13, 13, "h"))

        deck.add(Card(R.drawable.s1, 1, "s"))
        deck.add(Card(R.drawable.s2, 2, "s"))
        deck.add(Card(R.drawable.s3, 3, "s"))
        deck.add(Card(R.drawable.s4, 4, "s"))
        deck.add(Card(R.drawable.s5, 5, "s"))
        deck.add(Card(R.drawable.s6, 6, "s"))
        deck.add(Card(R.drawable.s7, 7, "s"))
        deck.add(Card(R.drawable.s8, 8, "s"))
        deck.add(Card(R.drawable.s9, 9, "s"))
        deck.add(Card(R.drawable.s11, 10, "s"))
        deck.add(Card(R.drawable.s11, 11, "s"))
        deck.add(Card(R.drawable.s12, 12, "s"))
        deck.add(Card(R.drawable.s13, 13, "s"))

        deck.add(Card(R.drawable.r1, 1, "r"))
        deck.add(Card(R.drawable.r2, 2, "r"))
        deck.add(Card(R.drawable.r3, 3, "r"))
        deck.add(Card(R.drawable.r4, 4, "r"))
        deck.add(Card(R.drawable.r5, 5, "r"))
        deck.add(Card(R.drawable.r6, 6, "r"))
        deck.add(Card(R.drawable.r7, 7, "r"))
        deck.add(Card(R.drawable.r8, 8, "r"))
        deck.add(Card(R.drawable.r9, 9, "r"))
        deck.add(Card(R.drawable.r11, 10, "r"))
        deck.add(Card(R.drawable.r11, 11, "r"))
        deck.add(Card(R.drawable.r12, 12, "r"))
        deck.add(Card(R.drawable.r13, 13, "r"))

        deck.add(Card(R.drawable.c1, 1, "c"))
        deck.add(Card(R.drawable.c2, 2, "c"))
        deck.add(Card(R.drawable.c3, 3, "c"))
        deck.add(Card(R.drawable.c4, 4, "c"))
        deck.add(Card(R.drawable.c5, 5, "c"))
        deck.add(Card(R.drawable.c6, 6, "c"))
        deck.add(Card(R.drawable.c7, 7, "c"))
        deck.add(Card(R.drawable.c8, 8, "c"))
        deck.add(Card(R.drawable.c9, 9, "c"))
        deck.add(Card(R.drawable.c11, 10, "c"))
        deck.add(Card(R.drawable.c11, 11, "c"))
        deck.add(Card(R.drawable.c12, 12, "c"))
        deck.add(Card(R.drawable.c13, 13, "c"))
    }
}