package com.example.v1bussen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class htpActivity : AppCompatActivity() {
    lateinit var htpTextView: TextView
    lateinit var backButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_htp)
        backButton = findViewById(R.id.buttonBack)
        htpTextView = findViewById(R.id.htpTextView)
        htpTextView.text =
            "Bussen går ut på att klara alla fyra nivåer,  börja spelet genom att trycka på kortet nere till höger. " +
                    "Sedan ska användaren trycka på valfritt kort i första raden samt gissa (Högre/Lägre),(Röd/svart) eller (Samma eller inte samma färg). " +
                    "Om användaren gissar rätt får den gå vidare till rad 2 med första radens kort som utgångspunkt. " +
                    "fortsätt tills alla rader är avklarade!"

        backButton.setOnClickListener {
            finish()
        }


    }
}