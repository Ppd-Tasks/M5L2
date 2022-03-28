package com.example.m5l2kt.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5l2kt.Model.Chat
import com.example.m5l2kt.R
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context,var items:ArrayList<Chat>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_contacts,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if (holder is MessageViewHolder){
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var iv_icon = holder.iv_icon
            var tv_count = holder.tv_count

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullname.toString()
            iv_icon.setImageResource(chat.icon)
            tv_count.text = chat.count //.toString()

            if (chat.count == "┛"){
                tv_count.visibility = View.VISIBLE
            }else{
                tv_count.visibility = View.GONE
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MessageViewHolder(var view: View):RecyclerView.ViewHolder(view){
        val iv_profile:ShapeableImageView
        var tv_fullname:TextView
        var iv_icon:ImageView
        var tv_count:TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_count = view.findViewById(R.id.count)
            iv_icon = view.findViewById(R.id.iv_icon)
        }
    }
}