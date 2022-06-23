package org.tory.ecofit.data.model.response

import com.google.gson.annotations.SerializedName

data class ResponseHabitPoint(
    @SerializedName("count")
    val count: Int,
    @SerializedName("point")
    val point: Int,
)
