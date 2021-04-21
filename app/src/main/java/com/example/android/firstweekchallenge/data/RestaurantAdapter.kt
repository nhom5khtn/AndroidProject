package com.example.android.firstweekchallenge.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.firstweekchallenge.R

class RestaurantAdapter:RecyclerView.Adapter<RestaurantAdapter.viewHolder>() {
    var data : List<Restaurant> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(R.layout.restaurant_item_view, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        var item = data[position]
        holder.tvName.text = item.name
        holder.txAddress.text =item.address


    }

    override fun getItemCount(): Int {
        return data.size
    }

    class viewHolder(val itemView:View): RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val txAddress = itemView.findViewById<TextView>(R.id.tvAddress)
        //val imAvatar = itemView.findViewById<>(R.id.imageview)
    }
}


