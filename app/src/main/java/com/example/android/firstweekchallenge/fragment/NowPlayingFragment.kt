package com.example.android.firstweekchallenge.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.data.MovieStore
import com.example.android.firstweekchallenge.ui.MovieAdapter
import com.example.android.firstweekchallenge.ui.viewmodel.NowPlayingViewModel

class NowPlayingFragment : Fragment() {
    private lateinit var adapter: MovieAdapter
    private lateinit var nowPlayingViewModel: NowPlayingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nowPlayingViewModel = ViewModelProvider(this).get(NowPlayingViewModel::class.java)
        adapter = MovieAdapter()
        val view = inflater.inflate(R.layout.fragment_now_playing, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rcNowPlayingList)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = MovieAdapter()
        recyclerView.adapter = adapter
        Log.e("check data", MovieStore.movieNowPlayingList?.results.toString())
        adapter.submitList(MovieStore.movieNowPlayingList?.results)
        return view
    }
}