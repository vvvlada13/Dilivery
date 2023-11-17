package com.example.dilivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BurgerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)
    }
    fun buttonSendClick6(view: View){
        val intent: Intent = Intent(this@BurgerActivity, FoodActivity3::class.java)
        startActivity(intent)
    }
}