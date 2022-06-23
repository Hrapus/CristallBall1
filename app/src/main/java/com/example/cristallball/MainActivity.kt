package com.example.cristallball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristallball.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tView.setOnClickListener{
            binding.tView.text = getWord()
        }
    }

    private fun getWord(): String{
        return resources.getStringArray(R.array.word)[randomNumber()]
    }

    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.word).size
        return (0 until size).random()
    }
}