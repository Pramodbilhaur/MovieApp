package com.example.movieproject.common.base

interface Mapper<F, T> {

    fun fromMap(from: F): T

}