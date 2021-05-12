package com.example.android.firstweekchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.android.firstweekchallenge.fragment.OnBoardingOneFragment
import com.example.android.firstweekchallenge.fragment.RestaurantFragment

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

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