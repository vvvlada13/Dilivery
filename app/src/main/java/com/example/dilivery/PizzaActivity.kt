package com.example.dilivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PizzaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)
    }
    fun buttonSendClick5(view: View){
        val intent: Intent = Intent(this@PizzaActivity, FoodActivity3::class.java)
        startActivity(intent)
    }
}