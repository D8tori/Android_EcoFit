package org.tory.ecofit.data.api

import org.tory.ecofit.data.model.response.ResponseHabitPoint
import org.tory.ecofit.data.model.response.ResponseUserHistory
import org.tory.ecofit.data.model.response.ResponseUserInfo
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {
    @GET("user/point")
    suspend fun getUserInfo(
    ) : ResponseUserInfo

    @GET("user/list")
    suspend fun getUserHistory(
    ) : ResponseUserHistory
}