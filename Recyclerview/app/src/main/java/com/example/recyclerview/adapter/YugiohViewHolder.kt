package com.example.recyclerview.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.yugioh

class yugiohViewHolder(view: View):RecyclerView.ViewHolder(view){

    val card= view.findViewById<TextView>(R.id.card)
    val type = view.findViewById<TextView>(R.id.type)
    val atk = view.findViewById<TextView>(R.id.atk)
    val def = view.findViewById<TextView>(R.id.def)


    fun render(yugiohmodel: yugioh){
        card.text = yugiohmodel.Card
        type.text = yugiohmodel.Type
        atk.text = yugiohmodel.Atk.toString()
        def.text = yugiohmodel.Def.toString()



    }
}