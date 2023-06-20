package com.angela.billz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.angela.billz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validateSignUp() {
        val userName = binding.etUserName.text.toString()
        val email = binding.etEmailAddress.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmation = binding.etConfirmPassword.text.toString()
        var error = false

        if (userName.isBlank()) {
            binding.tilUserName.error = "Username is required"
            error = true
        } else {
            binding.tilUserName.error = null
        }

        if (email.isBlank()) {
            binding.tilEmailAddress.error = "Email is required"
            error = true
        } else {
            binding.tilEmailAddress.error = null
        }

        if (password.isBlank()) {
            binding.tilPassword.error = "Password is required"
            error = true
        } else {
            binding.tilPassword.error = null
        }

        if (confirmation.isBlank()) {
            binding.tilConfirmPassword.error = "Password confirmation is required"
            error = true
        } else {
            binding.tilConfirmPassword.error = null
        }


    }
}








