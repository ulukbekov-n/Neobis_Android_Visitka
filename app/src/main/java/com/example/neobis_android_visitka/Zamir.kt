package com.example.neobis_android_visitka

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_visitka.databinding.ActivityFirstBinding
import com.example.neobis_android_visitka.databinding.ActivityMainBinding
import com.example.neobis_android_visitka.databinding.ActivityZamirBinding

class Zamir : AppCompatActivity() {
    private lateinit var binding: ActivityZamirBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZamirBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding.call.setOnClickListener { makeCall() }
        binding.mail.setOnClickListener { writeMail() }
        binding.linkto.setOnClickListener { goMap() }

    }

    private fun makeCall() {
        val callIntent = Intent(Intent.ACTION_DIAL)
        val phoneNumber = "+996776778002"
        callIntent.data = Uri.parse("tel:$phoneNumber")
        startActivity(callIntent)

    }

    private fun writeMail() {
        val mailIntent = Intent(Intent.ACTION_SENDTO)
        val emailAddress = "ulukbekov_n@auca.kg"
        mailIntent.setDataAndType(Uri.parse("mailto:" + emailAddress),null)
        startActivity(mailIntent)

    }

    private fun goMap() {
        val placeIntent = Uri.parse(
            "https://www.google.kg/maps/place/Vertex+Dental+clinic/" +
                    "@42.825031,74.544791,14z/data=!4m10!1m2!2m1!1sdental+" +
                    "clinic!3m6!1s0x389ec976e78d4e3b:0x264c63f57882f284!" +
                    "8m2!3d42.825031!4d74.5828998!15sCg1kZW50YWwgY2xpbmljkg" +
                    "ENZGVudGFsX2NsaW5pY-ABAA!16s%2Fg%2F11ljt2vp2d"
        )
        val mapIntent = Intent(Intent.ACTION_VIEW, placeIntent)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }
}
