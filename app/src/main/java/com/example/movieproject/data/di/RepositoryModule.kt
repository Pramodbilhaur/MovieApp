package com.example.movieproject.data.di

import com.example.movieproject.data.repository.MovieRepositoryImpl
import com.example.movieproject.features.movies.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideMovieRepository(
        repo: MovieRepositoryImpl
    ): MovieRepository
}
