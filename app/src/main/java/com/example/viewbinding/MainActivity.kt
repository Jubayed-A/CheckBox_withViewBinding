package com.example.viewbinding

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
            if (binding.checkBox.isChecked){
                // open a new Screen
                val intentWelcome = Intent(this, WelcomeActivity::class.java)
                startActivity(intentWelcome)
            } else{
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Please accept T&C to SignUp", Toast.LENGTH_SHORT).show()
            }
        }

    }
}