package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {
   /*retrieve list of mars photos object
     it's called from a coroutine so must a be suspend since is a network request*/
    
    suspend  fun getMarsPhotos(): List<MarsPhoto>
}


class NetworkMarsPhotosRepository( private val marsApiService: MarsApiService) : MarsPhotoRepository{
    
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}

