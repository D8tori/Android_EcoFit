package org.tory.ecofit.data.model.response

import com.google.gson.annotations.SerializedName

data class ResponseUserHistory(
    @SerializedName("data")
    val `data`: UserHistoryData,
)

data class UserHistoryData(
    @SerializedName("title")
    val title: String,
)