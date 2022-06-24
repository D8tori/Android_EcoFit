package org.tory.ecofit.data.model.response

import com.google.gson.annotations.SerializedName

data class ResponseHabitPoint(
    @SerializedName("habit")
    val habit: List<HabitPointData>
)

data class HabitPointData(
    @SerializedName("count")
    val count: Int,
    @SerializedName("point")
    val point: Int,
)