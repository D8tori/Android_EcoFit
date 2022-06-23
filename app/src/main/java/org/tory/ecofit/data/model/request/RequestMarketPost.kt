package org.tory.ecofit.data.model.request

import com.google.gson.annotations.SerializedName

data class RequestMarketPost(
    @SerializedName("name")
    val name: String,

    @SerializedName("price")
    val price: Int,

    @SerializedName("explanation")
    val explanation: String,

    @SerializedName("hashTag")
    val hashTag: String,

    @SerializedName("image")
    val image: String
)
