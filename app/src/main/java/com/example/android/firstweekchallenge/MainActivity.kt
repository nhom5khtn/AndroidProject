package com.example.android.firstweekchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

import com.nhom5.chanllengew5.Fragments.FavoriteFragment
import com.nhom5.chanllengew5.Fragments.TopFragment
import com.nhom5.chanllengew5.Fragments.adapters.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val toolbar: androidx.appcompat.widget.Toolbar= findViewById(R.id.toolbar_main)
//        setSupportActionBar(toolbar)
//        supportActionBar!!.title=""

        val tabLayout: TabLayout = findViewById(R.id.tab_layout)
        val viewPaper:ViewPager = findViewById(R.id.view_paper)
        val viewPaperAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPaperAdapter.addFragment(TopFragment(), "Top")
        viewPaperAdapter.addFragment(FavoriteFragment(), "Favorite")

        viewPaper.adapter = viewPaperAdapter
        tabLayout.setupWithViewPager(viewPaper)
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_top)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_favorite)
    }

//    private fun setupTab() {
//
//
//        val adapter = ViewPagerAdapter(supportFragmentManager)
//        adapter.addFragment(TopFragment(),"Top")
//        adapter.addFragment(FavoriteFragment(), "Favorite")
//        view
//    }
}