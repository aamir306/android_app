package com.example.recent_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun toastMe() {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = makeText(this, "Hello Toast!", LENGTH_SHORT)
        myToast.show()
    }


    fun countMe () {
        // Get the text view

        // Get the value of the text view.
        val countString = count_text.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        count_text.text = count.toString();
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_button.setOnClickListener {
            toastMe()
        }

        random_button.setOnClickListener {
            randomMe()
        }

        count_button.setOnClickListener {
            countMe()
        }

    }
    fun randomMe () {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, Main2Activity::class.java)

        // Get the current value of the text view.
        val countString = count_text.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(Main2Activity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }
}
