package com.mozn.applicationdpei

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.mozn.applicationdpei.databinding.ActivityConstraintBinding


class ConstraintActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConstraintBinding

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSignUp.setOnClickListener {
            val password = binding.passwordEditText.text.toString()
            val confirmPassword = binding.confirmPasswordEditText.text.toString()

            if (password != confirmPassword) {
                Toast.makeText(this, "Passwords does not match", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Sign Up Successful!", Toast.LENGTH_SHORT).show()

            }
        }

        binding.ivGoogle.setOnClickListener{
            openUrl("https://accounts.google.com/ServiceLogin")
        }

        binding.ivFacebook.setOnClickListener{
            openUrl("https://www.facebook.com/")
        }

        binding.ivLinkedin.setOnClickListener{
            openUrl("https://www.linkedin.com/login")
        }






//        Snackbar.make(binding.root, "hello", Snackbar.LENGTH_INDEFINITE).
//        setAction("dismiss"){
//            Toast.makeText(this, "hi", Toast.LENGTH_LONG).show()
//        }.show()

//        binding.btnClickMe.setOnClickListener {
//            val userName = binding.etUsername.text.toString()
//            Toast.makeText(this, userName, Toast.LENGTH_LONG).show()
//            binding.btnClickMe.text = userName
//
//        }

    }

    override fun onResume() {
        super.onResume()

    }






}