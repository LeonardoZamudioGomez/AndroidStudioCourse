package com.leotesta017.androidstudiocourse.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.leotesta017.androidstudiocourse.R

class FirstAppActivity : AppCompatActivity()
{
    // When starting the screen.
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) // Main method.
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app) // Screen design.

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart) // Button 1
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener{ // Button 1
            val name = etName.text.toString()

            if(name.isNotEmpty())
            {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))

        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}