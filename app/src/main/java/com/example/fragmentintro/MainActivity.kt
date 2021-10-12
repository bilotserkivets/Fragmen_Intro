package com.example.fragmentintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction().replace(R.id.counterFragment, CounterFragment.newInstance())
            .commit()

        supportFragmentManager
            .beginTransaction().replace(R.id.style_fragment, StyleFragment.newInstance())
            .commit()

    }


}