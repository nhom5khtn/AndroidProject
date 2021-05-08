package com.example.android.firstweekchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.android.firstweekchallenge.fragment.OnBoardingOneFragment
import com.example.android.firstweekchallenge.fragment.RestaurantFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<OnBoardingOneFragment>(R.id.frag_container_view)
        }

    }
}