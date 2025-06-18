package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class FavoriteNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_number)

        // Since the layout only has a TextView, just update it directly:
        val favText = findViewById<TextView>(R.id.favorite_number)
        val number = 42  // your favorite number
        favText.text = "Your favorite: $number"
    }
}
