package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.yugioh

class yugiohAdapter(private val yugiohList:List<yugioh>) : RecyclerView.Adapter<yugiohViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): yugiohViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return yugiohViewHolder(layoutInflater.inflate(R.layout.item_yugioh,parent,false))

    }

    override fun onBindViewHolder(holder: yugiohViewHolder, position: Int) {
        val item = yugiohList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = yugiohList.size


}