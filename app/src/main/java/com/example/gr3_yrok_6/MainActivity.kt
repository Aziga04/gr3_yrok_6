package com.example.gr3_yrok_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gr3_yrok_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.conteiner_2, PlaylistFtagment()).commit()
            supportFragmentManager.beginTransaction().add(R.id.conteiner, MainFragment()).commit()
        }
    }
}