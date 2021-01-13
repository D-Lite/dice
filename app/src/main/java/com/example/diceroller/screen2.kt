package com.example.diceroller


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_screen2.*
import java.util.*

class screen2 : AppCompatActivity() {

    companion object{
        const val USER1 = "USER1"
        const val USER2 = "USER2"
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide();

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val user1 = intent.getStringExtra(USER1)
        val user2 = intent.getStringExtra(USER2)

        usershow1.text = "User 1 is "+user1
        usershow2.text = "User 2 is "+user2

//        val rollButton = findViewById<Button>(R.id.roll_button)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
//            Toast.makeText(this,  "Roll Dice", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice(){
//        TODO("not implemented")
        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableRes = when(Random().nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableRes)
    }
}