package com.example.android.firstweekchallenge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.movie.Movie

class MovieAdapter(data: List<Movie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder> (){
    var data : List<Movie> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(R.layout.item_view,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = data[position]
        holder.tvTitle.text=item.backdropPath
        holder.tvDescription.text=item.originalTitle
        holder.imageView.setImageDrawable(item.posterPath)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
    }
}