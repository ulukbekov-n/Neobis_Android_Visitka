 package com.example.neobis_android_visitka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.neobis_android_visitka.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.firstButton.text="Novikov Azamat"
        binding.secondButton.text="Nurmatov Zamir"
        binding.thirdButton.text="Khalilova Munisa"
        binding.fourthButton.text="Alieva Adina"
        binding.fivethButton.text="Kolesova Victoria"
        val firstButton: Button= binding.firstButton
        firstButton.setOnClickListener({
            val fisrtPagePage = Intent(this, fisrtPage::class.java)
            startActivity(fisrtPagePage)
            finish()
        } )
        val secondButton: Button= binding.secondButton
        secondButton.setOnClickListener({
            val secondPagePage = Intent(this, Zamir::class.java)
            startActivity(secondPagePage)
            finish()
        } )


    }
}