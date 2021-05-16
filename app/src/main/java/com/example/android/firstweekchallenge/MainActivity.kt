package com.example.android.firstweekchallenge

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.android.firstweekchallenge.databinding.ActivityMainBinding
import com.example.android.firstweekchallenge.fragment.OnBoardingOneFragment
import com.example.android.firstweekchallenge.ui.viewmodel.NowPlayingViewModel
import com.example.android.firstweekchallenge.ui.viewmodel.TopRatedViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var nowPlayingViewModel: NowPlayingViewModel
    private lateinit var topRatedViewModel: TopRatedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)
        nowPlayingViewModel = ViewModelProvider(this).get(NowPlayingViewModel::class.java)
        topRatedViewModel = ViewModelProvider(this).get(TopRatedViewModel::class.java)
    }
    override fun onStart() {
        super.onStart()
        Log.e("onStart", " ")
        nowPlayingViewModel.getNowPlaying()
        topRatedViewModel.getTopRated()
    }
    override fun onResume() {
        super.onResume()
        Log.e("onResume", " ")
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            //add<OnBoardingOneFragment>(R.id.fragment_container_view)
            add<OnBoardingOneFragment>(R.id.fragment_container_view)
        }
    }
}