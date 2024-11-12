package com.dhafi.viewdata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.dhafi.viewdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnViewList.setOnClickListener{
            startActivity(Intent(applicationContext,
                ListviewActivity::class.java))
        }
        binding.btnRecylerView.setOnClickListener{
            startActivity(Intent(applicationContext,
                RecylerActivity::class.java))
        }
    }
}