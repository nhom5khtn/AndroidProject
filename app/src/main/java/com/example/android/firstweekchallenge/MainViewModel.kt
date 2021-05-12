package com.example.android.firstweekchallenge

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.firstweekchallenge.rest.RestClient
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    fun getNowPlaying(){
        viewModelScope.launch {
            val movieResp = RestClient.getInstance().API.listNowPlayingMovies(language = "en-US", page = 1, apiKey = "6acc65d1aca72eed8ef4b848fc655f95")
            Log.e("TAG", movieResp.results.toString())
        }
    }

    fun getTopRated(){
        viewModelScope.launch {
            val movieResp = RestClient.getInstance().API.listNowPlayingMovies(language = "en-US", page = 1, apiKey = "6acc65d1aca72eed8ef4b848fc655f95")
            Log.e("TAG+++", movieResp.results.toString())
        }
    }
}