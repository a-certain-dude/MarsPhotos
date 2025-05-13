package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    // abstract property
    val marsPhotosRepository: MarsPhotoRepository
}

class DefaultContainer : AppContainer {
    
    private val BASE_URL =
        "https://android-kotlin-fun-mars-server.appspot.com"
    
    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
    
    val retrofitService: MarsApiService by lazy { retrofit.create(MarsApiService::class.java) }
    
    
}