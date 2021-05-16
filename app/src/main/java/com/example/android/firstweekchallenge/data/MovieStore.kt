package com.example.android.firstweekchallenge.data

import com.example.android.firstweekchallenge.movie.MovieResp


class MovieStore private constructor() {
    companion object {
        var movieNowPlayingList: MovieResp? = null
        var movieTopRatedList: MovieResp? = null
    }
}