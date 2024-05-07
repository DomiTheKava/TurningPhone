package com.example.turningphone

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Landscape or Portrait"

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener() {
            if (button.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                Toast.makeText(this, "your in landscape", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "your in portrait", Toast.LENGTH_SHORT).show()
            }
        }

    }
}