package com.example.movieproject.data.network

import com.example.movieproject.data.model.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    companion object{
        const val BASE_URL = "https://api.themoviedb.org/3"
        const val IMAGE_URL = "https://image.tmdb.org/t/p/w500"
    }

    @GET("/discover/movie?api_key=6d607e1800184c5f5acb8c825a3c5532")
    suspend fun getMovies(): Response<Movies>
}