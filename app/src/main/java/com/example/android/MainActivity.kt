package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            intent = Intent(applicationContext,linkedinactivity::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener(){
            intent = Intent(applicationContext,GithubActivity::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener(){
            intent = Intent(applicationContext,InstagramActivity::class.java)
            startActivity(intent)
        }
    }


}