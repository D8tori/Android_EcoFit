package org.tory.ecofit.data.model.request

import com.google.gson.annotations.SerializedName

data class RequestChallengeImage(
    @SerializedName("image")
    val image: String
)
