package com.example.movieproject.features.movies.domain.repository

import com.example.movieproject.common.base.ApiState
import com.example.movieproject.data.model.Movies
import kotlinx.coroutines.flow.Flow


interface MovieRepository {

    suspend fun getMovies(): Flow<ApiState<Movies>>
}