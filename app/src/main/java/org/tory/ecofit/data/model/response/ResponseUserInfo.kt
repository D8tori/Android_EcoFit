package org.tory.ecofit.data.model.response

import com.google.gson.annotations.SerializedName

data class ResponseUserInfo(
    @SerializedName("id")
    val count: String,
    @SerializedName("point")
    val point: Int,
)
