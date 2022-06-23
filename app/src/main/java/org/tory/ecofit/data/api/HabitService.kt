package org.tory.ecofit.data.api

import org.tory.ecofit.data.model.response.ResponseHabitPoint
import retrofit2.http.*

interface HabitService {
    @GET("habit/click/{title}")
    suspend fun updatePoint(
        @Path("title") title : String,
    ) : ResponseHabitPoint

    @PUT("habit/add/{num}/{newtitle}")
    suspend fun updateTitle(
        @Path("num") num: Int,
        @Path("newtitle") newtitle: String
    )
}