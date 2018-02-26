package com.example.hp.rockpaperscissors

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Main2Activity : Activity() {

    lateinit var playButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        playButton = findViewById(R.id.playButton)

        playButton.setOnClickListener {

            val intent: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)

        }
    }


}
