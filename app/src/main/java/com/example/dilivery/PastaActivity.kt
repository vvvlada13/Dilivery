package com.example.dilivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PastaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasta)
    }
    fun buttonSendClick7(view: View){
        val intent: Intent = Intent(this@PastaActivity, FoodActivity3::class.java)
        startActivity(intent)
    }
}