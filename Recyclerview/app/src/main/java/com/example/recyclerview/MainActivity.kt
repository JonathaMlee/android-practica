package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.yugiohAdapter


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val recyclerView =  findViewById<RecyclerView>(R.id.recycleryugioh)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = yugiohAdapter(yugiohProvider.yugiohList)

    }
}