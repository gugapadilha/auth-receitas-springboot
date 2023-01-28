package com.ocanha.retrofitcomkotlin.data.rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

interface RetrofitService {

    companion object {

        private val retrofitService : RetrofitService by lazy {
            val retrofitService = Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080") //doing that getting IP directly
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            retrofitService.create(RetrofitService::class.java )
        }

    }
}