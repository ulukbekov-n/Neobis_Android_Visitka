 package com.example.neobis_android_visitka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.neobis_android_visitka.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.textButton.text="Novikov Azamat"
        binding.secondButton.text="Nurmatov Zamir"
        binding.thirdButton.text="Khalilova Munisa"
        binding.fourthButton.text="Alieva Adina"
        binding.fivethButton.text="Kolesova Victoria"
        val textButton: Button= findViewById(R.id.text_button)

    }
}