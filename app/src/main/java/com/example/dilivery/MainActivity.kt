package com.example.dilivery

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scheduleSplashScreen()
    }
    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 2000

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, StartActivity :: class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)

    }
}