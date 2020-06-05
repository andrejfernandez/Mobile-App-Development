package com.example.assignment3

import android.content.Context
import android.os.Bundle
import android.util.Log.d
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_main.view.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //hide the keyboard after button press
    fun hideMyKeyboard() {
        val view = this.currentFocus
        if(view != null) {
            val hideMe = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            hideMe.hideSoftInputFromWindow(view.windowToken, 0)
            //else
            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        } //end if
    } //end hide my keyboard

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        enter.setOnClickListener {
            when (editText.text.toString().toLowerCase()) {
                "dog" -> image.setImageResource(R.drawable.dog)
                "cat" -> image.setImageResource(R.drawable.cat)
                "fish" -> image.setImageResource(R.drawable.fish)
                "turtle" -> image.setImageResource(R.drawable.turtle)
                "bird" -> image.setImageResource(R.drawable.bird)
                "lizard" -> image.setImageResource(R.drawable.lizard)
                "rabbit" -> image.setImageResource(R.drawable.rabbit)
                "snake" -> image.setImageResource(R.drawable.snake)
                "hamster" -> image.setImageResource(R.drawable.hamster)
                "guinea pig" -> image.setImageResource(R.drawable.gpig)
                else -> image.setImageResource(R.drawable.error)
            }
            hideMyKeyboard()
        }// end enter

        randomize.setOnClickListener {
            var rand = Random.nextInt(1,11)

            when (rand) {
                1 -> image.setImageResource(R.drawable.dog)
                2 -> image.setImageResource(R.drawable.cat)
                3 -> image.setImageResource(R.drawable.fish)
                4 -> image.setImageResource(R.drawable.turtle)
                5 -> image.setImageResource(R.drawable.bird)
                6 -> image.setImageResource(R.drawable.lizard)
                7 -> image.setImageResource(R.drawable.rabbit)
                8 -> image.setImageResource(R.drawable.snake)
                9 -> image.setImageResource(R.drawable.hamster)
                10 -> image.setImageResource(R.drawable.gpig)
                else -> image.setImageResource(R.drawable.error)
            }
            hideMyKeyboard()
        } //end randomize

        clear.setOnClickListener {
            editText.text.clear()
            image.setImageResource(R.drawable.clear)
            hideMyKeyboard()
        } //end randomize

    }//end onCreate
} //end MainActivity