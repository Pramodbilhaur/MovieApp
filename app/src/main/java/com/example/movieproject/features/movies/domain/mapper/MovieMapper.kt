package com.example.movieproject.features.movies.domain.mapper

import com.example.movieproject.common.base.Mapper
import com.example.movieproject.data.model.Movies
import javax.inject.Inject

class MovieMapper @Inject constructor(): Mapper<Movies?, List<Movies.Results>?> {

    override fun fromMap(from: Movies?): List<Movies.Results>? {
        return from?.results?.map {
            Movies.Results(
                adult = it.adult,
                id = it.id,
                backdrop_path = it.backdrop_path,
                genre_ids = it.genre_ids,
                original_language = it.original_language,
                original_title = it.original_title,
                overview = it.overview,
                popularity = it.popularity,
                poster_path = it.poster_path,
                release_date = it.release_date,
                title = it.title,
                video = it.video,
                vote_average = it.vote_average,
                vote_count = it.vote_count
            )
        }
    }
}


//https://www.youtube.com/watch?v=afOaPWKV8us&list=WL&index=182&t=140s