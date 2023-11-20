package com.herdianurdin.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.herdianurdin.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdder.setOnClickListener { handleAdder() }
    }

    private fun handleAdder() {
        counter++
        binding.tvCounter.text = counter.toString()
    }
}