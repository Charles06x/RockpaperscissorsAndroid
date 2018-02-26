package com.example.hp.rockpaperscissors

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

class SplashActivity : Activity() {
    val SPLASH_TIME_OUT = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        Handler().postDelayed(object:Runnable{
            public override fun run() {
                val home = Intent(applicationContext, Main2Activity::class.java )
                startActivity(home)
                finish()
            }
        }, SPLASH_TIME_OUT.toLong())
    }
}
