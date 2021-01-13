package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbtn = findViewById<Button>(R.id.newlogin)

        loginbtn.setOnClickListener {
            val intent =Intent(this, loginpage::class.java)
            startActivity(intent)
        }

    }


}