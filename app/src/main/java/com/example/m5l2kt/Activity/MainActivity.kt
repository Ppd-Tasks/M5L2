package com.example.m5l2kt.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5l2kt.Adapter.ChatAdapter
import com.example.m5l2kt.Model.Chat
import com.example.m5l2kt.R

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_contacts)

        initViews()
    }

    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this,1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats:ArrayList<Chat>){
        val adapter = ChatAdapter(this,chats)
        recyclerView.adapter = adapter
    }

    private fun getAllChats():ArrayList<Chat>{
        var chats:ArrayList<Chat> = ArrayList()

        chats.add(Chat(R.mipmap.ic_add_person,"New Contacts",R.drawable.ic_arrow,""))
        chats.add(Chat(R.mipmap.ic_new_group_chat,"New Group Chat",R.drawable.ic_arrow,""))
        chats.add(Chat(R.mipmap.ic_user_tick,"Follow",R.drawable.ic_arrow,""))
        chats.add(Chat(R.mipmap.ic_two_people,"Groups",R.drawable.ic_arrow,""))

        chats.add(Chat(R.drawable.img_9,"wonder",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img,"Nazirov",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,".....",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_2,"Primqulov Jabbor",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,"Someone",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_5,"Mr Mansur",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,"Abdulloh",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,"Alisher",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_9,"wonder",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img,"Nazirov",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,".....",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_2,"Primqulov Jabbor",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,"Someone",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_5,"Mr Mansur",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,"Abdulloh",R.drawable.ic_phone_blue,"┛"))
        chats.add(Chat(R.drawable.img_11,"Alisher",R.drawable.ic_phone_blue,"┛"))

        return chats
    }
}