package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_loginpage.*
import org.w3c.dom.Text
import java.util.Arrays.toString
import kotlin.Unit.toString

class loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        val login = findViewById<Button>(R.id.loginbutton)

        login.setOnClickListener {
            val user1 = user1.text.toString();
            val user2 = user2.text.toString();


            val intent = Intent(this, screen2::class.java)
            intent.putExtra(screen2.USER1,user1)
            intent.putExtra(screen2.USER2,user2)
            startActivity(intent)
        }

    }
}