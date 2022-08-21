package com.mnazari2.helloworld_prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.hello_btn)
        btn.setOnClickListener{
            Log.v("Hello World", "Button Clicked")
            Toast.makeText(this,"Hello to you too!",Toast.LENGTH_SHORT).show()
        }
    }
}