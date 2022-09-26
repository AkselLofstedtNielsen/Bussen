package com.example.v1bussen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class htpActivity : AppCompatActivity() {
    lateinit var htpTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_htp)
        htpTextView = findViewById(R.id.htpTextView)
    }
}