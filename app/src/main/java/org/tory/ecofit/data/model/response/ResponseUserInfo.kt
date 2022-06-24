package org.tory.ecofit.data.model.response

import android.service.autofill.UserData
import com.google.gson.annotations.SerializedName

data class ResponseUserInfo(
    @SerializedName("user")
    val user: List<UserData>
)
data class UserData(
    @SerializedName("id")
    val id: String,
    @SerializedName("point")
    val point: Int,
)
