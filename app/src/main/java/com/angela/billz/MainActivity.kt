package com.angela.billz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.angela.billz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this,binding::class.java)
            startActivity(intent)
        }
        // Access the signup and login buttons using ViewBinding
        binding.btnRegister.setOnClickListener {
            // Handle signup button click
            // Perform the necessary signup logic here
            Toast.makeText(this, "Sign Up clicked", Toast.LENGTH_SHORT).show()
        }

        binding.btnRegister.setOnClickListener {
            // Handle login button click
            // Perform the necessary login logic here
            Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()
        validateSignUp()
    }

    fun validateSignUp(){
        val UserName = etUserName.text.toString()
        val email = etEmailAddress.text.toString()
        val password = etPassword.text.toString()
        val confirmation= etConfirmPassword.text.toString()
        var error = false
        if (UserName.isBlank()){
            tilUserName.error = "Username is required"
            error = true
        }

        if (email.isBlank()){
            tilEmailAddress.error = "Email is required"
            error = true
        }
        if (password.isBlank()){
            tilPassword.error = "Password is required"
            error = true
        }
        if (confirmation.isBlank()){
            tilConfirmPassword.error = "Password confirmation is required"
            error = true
        }
        if (password!=confirmation){
            tilConfirmPassword.error = "Password doesn't match"
            error = true
        }
        if (!error){
            Toast.makeText(this,"$UserName $email", Toast.LENGTH_LONG).show()
        }
    }
}




