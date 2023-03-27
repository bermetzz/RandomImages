package com.example.randomimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.randomimages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = arrayListOf(
            getString(R.string.first_url),
            getString(R.string.second_url),
            getString(R.string.third_url),
            getString(R.string.fourth_url),
            getString(R.string.fifth_url)
        )

        with(binding) {
            submitBtn.setOnClickListener {
                list.add(urlEt.text.toString())
                urlEt.setText("")
            }
            randomBtn.setOnClickListener {
                Glide.with(applicationContext).load(list.random()).into(randomIv)
            }
        }
    }
}