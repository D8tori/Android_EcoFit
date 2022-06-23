package org.tory.ecofit.data.api

import org.tory.ecofit.data.model.request.RequestChallengeImage
import org.tory.ecofit.data.model.request.RequestMarketPost
import org.tory.ecofit.data.model.response.ResponseChallengeList
import org.tory.ecofit.data.model.response.ResponseMarketList
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MarketService {
    @GET("market")
    suspend fun getMarketList(
    ) : ResponseMarketList

    @POST("market/add")
    suspend fun postMarketContent(
        @Body body: RequestMarketPost
    )
}