package com.mozn.applicationdpei.RecycleView

import androidx.recyclerview.widget.DiffUtil
import com.mozn.applicationdpei.API.Message

class MyDiffUtil(
//    private val oldList: List<com.mozn.applicationdpei.RecycleView.Message>,
//    private val newList: List<com.mozn.applicationdpei.RecycleView.Message>
    private val oldList: List<Message>,
    private val newList: List<Message>

): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition]== newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition]== newList[newItemPosition]
    }
}