package com.example.android.firstweekchallenge.ui.view



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.data.RestaurantAdapter
import com.example.android.firstweekchallenge.data.getData
import com.example.android.firstweekchallenge.databinding.ActivityListrestaurantBinding
import com.example.android.firstweekchallenge.ui.viewmodel.RestaurantViewModel

class ListRestaurantActivity : AppCompatActivity() {
    private lateinit var binding:ActivityListrestaurantBinding
    private lateinit var viewModel:RestaurantViewModel
    private lateinit var adapter: RestaurantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_listrestaurant)
        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)
        adapter = RestaurantAdapter()
        binding.rcList.layoutManager = LinearLayoutManager(this)
        binding.rcList.adapter = adapter
        adapter.submitList(getData())
    }
}



