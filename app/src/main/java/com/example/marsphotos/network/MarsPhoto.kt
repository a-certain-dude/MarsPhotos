package com.example.marsphotos.network

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto(
        val id: String,
        /* SerialName was used and it produced null when printed */
        @SerializedName(value = "img_src")
        val imgSrc: String
)