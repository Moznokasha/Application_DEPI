package com.mozn.applicationdpei.RecycleView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mozn.applicationdpei.databinding.RvItemBinding
import java.util.ArrayList

//R is a generated class that acts as a map to all the resources in your project.
//private val items: List<String> was inside customAdapter(private val items: List<String>)

class CustomAdapter() : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    private var itemList: List<Message> = emptyList()
    //var onItemClick: OnItemClick<String>? = null
    var messages: ArrayList<Message> = arrayListOf()

     //ViewHolder holds reference to each item's views
    inner class ViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        var text: TextView = view.findViewById(R.id.tv5)
//         var username: TextView = view.findViewById(R.id.tv_username)
//         var icon: ImageView = view.findViewById(R.id.iv_icon)



         fun bind(message: Message){
//           binding.setImageResource(message.iconId)
//             binding.setText(message.username)
//            binding.setText(message.text)


             binding.tv5.text = message.text


         }
    }

//    fun setMessages(messages: ArrayList<Message>){
//        this.messages = messages
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view: View = LayoutInflater.from(parent.context)
//            .inflate(R.layout.rv_item, parent, false)
//        return ViewHolder(view)
        return ViewHolder(
            RvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
//
         }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       // var message: Message = messages[position]
        holder.bind(itemList[position])
    }



    override fun getItemCount(): Int = messages.size


    fun updateList(newList: List<Message>){
//        this.itemList = newList
//        notifyDataSetChanged() //old way

        val diffUtilCllBack = MyDiffUtil(oldList = this.itemList, newList = newList)
        val diffUtilResult = DiffUtil.calculateDiff(diffUtilCllBack)
        this.itemList = newList
        diffUtilResult.dispatchUpdatesTo(this)
    }
}


