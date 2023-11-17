package com.example.dilivery

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.content.Intent as Intent1

class LoginUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user)


    }
    @SuppressLint("SuspiciousIndentation")
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Добро пожаловать!", Toast.LENGTH_SHORT)
        myToast.show()

        val intent = Intent(this@LoginUser, FoodActivity3 :: class.java)
            startActivity(intent)
        }
    }