package com.example.android.firstweekchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.android.firstweekchallenge.data.getData
import com.example.android.firstweekchallenge.databinding.ActivityMainBinding
import com.example.android.firstweekchallenge.fragment.OnBoardingOneFragment
import com.example.android.firstweekchallenge.fragment.RestaurantFragment
import com.example.android.firstweekchallenge.ui.MovieAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val adapter = MovieAdapter()
        binding.rcList.adapter = adapter
        adapter.data = getData()        // cho nay getdata() tu danh sach du lieu get tu api

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<OnBoardingOneFragment>(R.id.frag_container_view)
        }
    }

    override fun onStart() {
        super.onStart()
        mainViewModel.getNowPlaying()
        mainViewModel.getTopRated()
    }

}