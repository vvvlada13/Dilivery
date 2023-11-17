package com.example.dilivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salat)
    }
    fun buttonSendClick8(view: View){
        val intent: Intent = Intent(this@SalatActivity, FoodActivity3::class.java)
        startActivity(intent)
    }
}