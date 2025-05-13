package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {
   /*retrieve list of mars photos object
     it's called from a coroutine so must a be suspend since is a network request*/
    
    suspend  fun getPhotos(): List<MarsPhoto>
}


class NetworkMarsPhotosRepository : MarsPhotoRepository{
    
    override suspend fun getPhotos(): List<MarsPhoto>{
        return MarsApi.retrofitService.getPhotos()
    }
}

