package com.example.android.firstweekchallenge.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.firstweekchallenge.MovieViewModel
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.data.MovieStore
import com.example.android.firstweekchallenge.ui.MovieAdapter

class TopRatedFragment : Fragment() {
    private lateinit var adapter: MovieAdapter
    private lateinit var movieViewModel: MovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        movieViewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        adapter = MovieAdapter()
        val view = inflater.inflate(R.layout.fragment_top_rated, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rcTopRatedList)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = MovieAdapter()
        recyclerView.adapter = adapter
        adapter.submitList(MovieStore.movieTopRatedList?.results)
        return view
    }
}