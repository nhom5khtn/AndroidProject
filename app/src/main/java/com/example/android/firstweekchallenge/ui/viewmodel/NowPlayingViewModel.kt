package com.example.android.firstweekchallenge.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.firstweekchallenge.data.MovieStore
import com.example.android.firstweekchallenge.movie.MovieResp
import com.example.android.firstweekchallenge.rest.RestClient
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NowPlayingViewModel : ViewModel() {
    var listNowPlaying : MutableLiveData<MovieResp> = MutableLiveData()

    fun getNowPlaying(){
        viewModelScope.launch {
            val movieResp = RestClient.getInstance().API.listNowPlayingMovies(language = "en-US", page = 1, apiKey = "6acc65d1aca72eed8ef4b848fc655f95")
            Log.e("TAG", movieResp.results.toString())
            listNowPlaying.value = movieResp
            MovieStore.movieNowPlayingList = movieResp
        }
    }
}