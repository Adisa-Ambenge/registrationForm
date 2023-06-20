package com.angela.billz

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.angela.billz.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        onResume()
    }

    override fun onResume() {
        super.onResume()
        validateLogin()
    }

    fun validateLogin(){
        val username = binding.tilUserName.editText?.text.toString()
        val password = binding.tilPassword.editText?.text.toString()
        var error = false

        if (username.isEmpty()) {
            binding.tilUserName.error = "Username is required"
            error = true

        }

        if (password.isEmpty()) {
            binding.tilPassword.error = "Password is required"
            error = true

        }


        Toast.makeText(this, "Logged in as $username", Toast.LENGTH_SHORT).show()
    }
}