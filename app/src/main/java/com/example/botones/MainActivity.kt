package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.botones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.btnGo.setOnClickListener {
        val intent= Intent(this@MainActivity,ResultActivity::class.java)
        startActivity(intent)
        }
        b.bntGradient.setOnClickListener {
            val intent= Intent(this@MainActivity,SeekbarActivity::class.java)
            startActivity(intent)
        }
    }
}