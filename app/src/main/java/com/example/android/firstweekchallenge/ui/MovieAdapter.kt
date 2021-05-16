package com.example.android.firstweekchallenge.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.firstweekchallenge.R import com.example.android.firstweekchallenge.movie.Movie


class MovieAdapter : ListAdapter<Movie,  MovieAdapter.ViewHolder>(
    MovieDiffUtilCallback()){
        class MovieDiffUtilCallback : DiffUtil.ItemCallback<Movie>(){
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem.originalTitle == newItem.originalTitle
            }
            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem == newItem
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent) as ViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var itemMovie = getItem(position)
        holder.bind(itemMovie)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)

        companion object {
            fun from(parent: ViewGroup) : RecyclerView.ViewHolder {
                var layoutInflater = LayoutInflater.from(parent.context)
                var view = layoutInflater.inflate(R.layout.item_view, parent, false)
                return ViewHolder(view)
            }
        }

        fun bind(itemMovie: Movie) {
            Log.e("setup data", itemMovie.toString())
            tvTitle.text = itemMovie.title
            tvDescription.text = itemMovie.overview
            Glide.with(itemView).load("https://image.tmdb.org/t/p/w500/" + itemMovie.backdropPath).into(imageView)
        }
    }

}