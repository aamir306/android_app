package com.example.recent_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showRandomNumber()
    }
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
    fun showRandomNumber() {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)


        val random = Random()

        // Generate the random number
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        // Display the random number.
        findViewById<TextView>(R.id.textview_random).text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_heading, count)
    }

}
