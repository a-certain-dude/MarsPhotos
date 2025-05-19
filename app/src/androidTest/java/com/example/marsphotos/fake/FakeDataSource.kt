package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsPhoto

object FakeDataSource{
    
    private const val  ID = "4533u"
    private const val  IMG_SRC = "marsPhotos.url.com"
    
    //  pretend to receive data from the Mars photos object
    val fakeData: List<MarsPhoto> = listOf(MarsPhoto(id = ID, imgSrc = IMG_SRC,))
    
}
