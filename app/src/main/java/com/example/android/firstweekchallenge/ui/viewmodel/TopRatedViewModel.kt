package com.example.android.firstweekchallenge.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.firstweekchallenge.data.MovieStore
import com.example.android.firstweekchallenge.movie.MovieResp
import com.example.android.firstweekchallenge.rest.RestClient
import kotlinx.coroutines.launch

class TopRatedViewModel : ViewModel() {
    var listTopRated : MutableLiveData<MovieResp> = MutableLiveData()

    fun getTopRated(){
        viewModelScope.launch {
            val movieResp = RestClient.getInstance().API.listTopRatedMovies(language = "en-US", page = 1, apiKey = "6acc65d1aca72eed8ef4b848fc655f95")
            Log.e("TAG", movieResp.results.toString())
            listTopRated.value = movieResp
            MovieStore.movieTopRatedList = movieResp
        }
    }
}