package org.tory.ecofit.data.model.response

import com.google.gson.annotations.SerializedName

data class ResponseChallengeList(
    @SerializedName("count")
    val count: Int,
    @SerializedName("data")
    val `data`: ChallengeData,
)

data class ChallengeData(
    @SerializedName("image")
    val image: String,
)
