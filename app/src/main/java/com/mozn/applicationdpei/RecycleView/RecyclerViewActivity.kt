package com.mozn.applicationdpei.RecycleView

import com.mozn.applicationdpei.R
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mozn.applicationdpei.databinding.ActivityRecyclerViewBinding
import java.util.ArrayList
import com.mozn.applicationdpei.API.Message


class RecyclerViewActivity(): AppCompatActivity(), OnItemClick<Message>
 {
     var usernme: String = "anonymous"
     var messages: ArrayList<Message> = arrayListOf()
     private lateinit var messageAdapter: CustomAdapter

     private val bestPracticeAdapter by lazy { CustomAdapter() }
    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        messageAdapter = CustomAdapter()
        binding.recyclerView.adapter = messageAdapter

        binding.button.setOnClickListener {
//            var message = Message(R.drawable.ic_launcher_foreground, usernme, binding.textView.text.toString())
            val message = Message(
                id = messages.size + 1,
                username = usernme,
                text = binding.textView.text.toString(),
                iconId = R.drawable.ic_launcher_foreground

            )
            messages.add(message)

            Toast.makeText(this, message.toString(), Toast.LENGTH_SHORT).show()


            bestPracticeAdapter.onItemClick = this



            bestPracticeAdapter.updateList(getMoreItems())
            binding.recyclerView.adapter = bestPracticeAdapter
            binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)



            messages.add(message)
           // messageAdapter.setMessages(messages)
            binding.textView.setText("")
        }


    }
     private fun getItems(): List<Message> {
         return messages
     }

     private fun getMoreItems(): List<Message> {
         return messages
     }

     override fun onItemClick(message: Message, position: Int)
     {
           bestPracticeAdapter.updateList(getItems())
 //        Toast.makeText(this, "item clicked: $message of position $position", Toast.LENGTH_SHORT).show()
     }


 }