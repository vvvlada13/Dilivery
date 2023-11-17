package com.example.dilivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class KorzinaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korzina)
    }
    fun buttonSendClick00(view: View){
        val intent: Intent = Intent(this@KorzinaActivity, FoodActivity3::class.java)
        startActivity(intent)
    }
}