package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_account.*

class GoodLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)

        homeBttn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}