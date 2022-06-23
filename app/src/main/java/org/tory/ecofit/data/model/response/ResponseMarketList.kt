package org.tory.ecofit.data.model.response

import com.google.gson.annotations.SerializedName

data class ResponseMarketList(
    @SerializedName("markets")
    val markets: List<MarketData>
)

data class MarketData(
    @SerializedName("name")
    val name: String,

    @SerializedName("price")
    val price: Int,

    @SerializedName("explanation")
    val explanation: String,

    @SerializedName("hashTag")
    val hashTag: String,

    @SerializedName("image")
    val image: String,
)