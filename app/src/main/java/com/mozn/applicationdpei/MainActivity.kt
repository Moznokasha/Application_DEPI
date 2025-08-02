package com.mozn.applicationdpei

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.mozn.applicationdpei.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
   // private lateinit var tvUserName: TextView
    private var username : String = "default user"
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvUsername.text = "sdfgh"
        binding.ivUseravatar.visibility = View.VISIBLE
        //
       //Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show()
        Snackbar.make(binding.root, "Hello snackbar",Snackbar.LENGTH_INDEFINITE )
            .setAction("Dismiss"){
                Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show()
            }.show()


//       val tvUserName : TextView = findViewById(R.id.tv_username)
//        tvUserName.text = "Hello World"
//        tvUserName.text = getString(R.string.app_name)
//        tvUserName.visibility = View.VISIBLE



    }






override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("username",username)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }

}