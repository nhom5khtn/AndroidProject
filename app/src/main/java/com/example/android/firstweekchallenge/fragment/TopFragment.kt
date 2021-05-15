package com.example.android.firstweekchallenge.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.data.RestaurantAdapter
import com.example.android.firstweekchallenge.data.getData

class TopFragment : Fragment() {
    private lateinit var adapter: RestaurantAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        adapter = RestaurantAdapter(false)
        val view = inflater.inflate(R.layout.fragment_top, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rcList)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = RestaurantAdapter(false)
        recyclerView.adapter = adapter
        adapter.submitList(getData())
        return view
    }
}
