package com.example.android.firstweekchallenge.movie

import com.example.android.firstweekchallenge.data.Restaurant
import com.google.gson.annotations.SerializedName

data class Movie (
    val adult: Boolean? = null,

    @SerializedName("backdrop_path")
    val backdropPath: String? = null,

    @SerializedName("genre_ids")
    val genreIDS: List<Long>? = null,
    val id: Long? = null,
    @SerializedName("original_language")
    val originalLanguage: OriginalLanguage? = null,

    @SerializedName("original_title")
    val originalTitle: String? = null,
    val overview: String? = null,
    val popularity: Double? = null,

    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("release_date")
    val releaseDate: String? = null,
    val title: String? = null,
    val video: Boolean? = null,
    @SerializedName("vote_average")
    val voteAverage: Double? = null,
    @SerializedName("vote_count")
    val voteCount: Long? = null
){
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as Movie

        if(title != other.title) return false
        if(originalTitle != other.originalTitle) return false
        if(backdropPath != other.backdropPath) return false

        return true
    }
}

enum class OriginalLanguage {
    En,
    Es,
    Ko
}