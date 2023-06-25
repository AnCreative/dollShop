package com.example.dollshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dollshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding.bNav.selectedItemId = R.id.item1
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> {}
                R.id.item2 -> {}
                R.id.item3 -> {}
                R.id.item4 -> {}
            }
         true
        }
    }

}