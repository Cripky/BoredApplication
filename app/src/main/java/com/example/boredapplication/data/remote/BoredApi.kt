package com.example.boredapplication.data.remote

import com.example.boredapplication.domain.model.Action
import retrofit2.http.GET

interface BoredApi {

    @GET("activity")
    suspend fun getRandomAction(): Action
}