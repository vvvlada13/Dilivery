package com.example.dilivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FoodActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food3)
    }

    fun buttonSendClick(view: View) {
        val intent: Intent = Intent(this@FoodActivity3, BurgerActivity::class.java)
        startActivity(intent)
    }

    fun buttonSendClick4(view: View) {
        val intent: Intent = Intent(this@FoodActivity3, PizzaActivity::class.java)
        startActivity(intent)
    }

    fun buttonSendClick2(view: View) {
        val intent: Intent = Intent(this@FoodActivity3, PastaActivity::class.java)
        startActivity(intent)
    }

    fun buttonSendClick3(view: View) {
        val intent: Intent = Intent(this@FoodActivity3, SalatActivity::class.java)
        startActivity(intent)
    }

    fun buttonSendClick9(view: View) {
        val intent: Intent = Intent(this@FoodActivity3, LoginUser::class.java)
        startActivity(intent)
    }
    fun buttonSendClick0(view: View) {
        val intent: Intent = Intent(this@FoodActivity3, KorzinaActivity::class.java)
        startActivity(intent)
    }
}