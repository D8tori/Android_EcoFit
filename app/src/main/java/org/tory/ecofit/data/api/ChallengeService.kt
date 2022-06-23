package org.tory.ecofit.data.api

import org.tory.ecofit.data.model.request.RequestChallengeImage
import org.tory.ecofit.data.model.response.ResponseChallengeList
import org.tory.ecofit.data.model.response.ResponseHabitPoint
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface ChallengeService {
    @GET("challenge/click/{title}")
    suspend fun getChallengeList(
        @Path("title") title : String,
    ) : ResponseChallengeList

    @PUT("challenge/add/{title}")
    suspend fun postChallengeContent(
        @Path("title") title : String,
        @Body body: RequestChallengeImage
    )
}