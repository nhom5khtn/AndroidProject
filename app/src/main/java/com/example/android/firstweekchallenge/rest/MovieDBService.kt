package com.example.android.firstweekchallenge.rest

import com.example.android.firstweekchallenge.movie.Movie
import com.example.android.firstweekchallenge.movie.MovieResp
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieDBService {
    @GET("movie/now_playing")
    suspend fun listNowPlayingMovies(
        @Query("language") language: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String,

        ): MovieResp

    @GET("movie/top_rated")
    suspend fun listTopRatedMovies(
        @Query("language") language: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String,
    ):MovieResp
}