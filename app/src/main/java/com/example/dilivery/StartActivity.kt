package com.example.dilivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        scheduleSplashScreen()
    }
    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 2000

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@StartActivity, LoginUser :: class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)

    }
}