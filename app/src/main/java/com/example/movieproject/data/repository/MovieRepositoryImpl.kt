package com.example.movieproject.data.repository

import com.example.movieproject.common.base.ApiState
import com.example.movieproject.common.base.BaseRepository
import com.example.movieproject.data.model.Movies
import com.example.movieproject.data.network.ApiService
import com.example.movieproject.features.movies.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): MovieRepository, BaseRepository() {

    override suspend fun getMovies(): Flow<ApiState<Movies>> = safeApiCall {
        apiService.getMovies()
    }
}