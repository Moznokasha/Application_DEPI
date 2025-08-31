package com.mozn.applicationdpei.explicitIntent

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.mozn.applicationdpei.R
import com.mozn.applicationdpei.RecycleView.CustomAdapter
import com.mozn.applicationdpei.databinding.ActivityRecyclerViewBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.mozn.applicationdpei.API.Message
import com.mozn.applicationdpei.API.Post

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding
   // private lateinit var tvUserName: TextView

    private lateinit var adapter: CustomAdapter
    private var username : String = "default user"
    private val tag = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "OnCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)




        adapter = CustomAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)





        val posts = listOf(
            Post(userId = 1, id = 1, title = "Hello from API!", body = "Body text 1"),
            Post(userId = 2, id = 2, title = "How are you?", body = "Body text 2")
        )


        val messages = posts.map { post ->
            Message(
                id = post.id,
                username = "User ${post.userId}",
                text = post.title,
                iconId = R.drawable.ic_launcher_foreground
            )
        }


        adapter.updateList(messages)


        //
       //Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show()
//        Snackbar.make(binding.root, "Hello snackbar",Snackbar.LENGTH_INDEFINITE )
//            .setAction("Dismiss"){
//                Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show()
//            }.show()


//       val tvUserName : TextView = findViewById(R.id.tv_username)

//        binding.button2.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra(Constants.Companion.USERNAME_KEY,"Mozn")
//            startActivity(intent)
//            finish()
//        }
//
//
//
//
//        binding.button3.setOnClickListener {
//            val shareIntent = Intent()
//            shareIntent.action = Intent.ACTION_SEND
//            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello mozn")
//            shareIntent.type = "text/plain"
//
//
//            startActivity(Intent.createChooser(shareIntent, "share with(title)"))
//        }


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
        Log.d(tag, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(tag, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }

}