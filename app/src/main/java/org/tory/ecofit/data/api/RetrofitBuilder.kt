package org.tory.ecofit.data.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "http://118.67.133.207/"

    private val gson = GsonBuilder()
        .setLenient()
        .create()

    val ecoFitRetrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val habitService: HabitService = ecoFitRetrofit.create(HabitService::class.java)
    val challengeService: ChallengeService = ecoFitRetrofit.create(ChallengeService::class.java)
    val marketService: MarketService = ecoFitRetrofit.create(MarketService::class.java)
    val userService: UserService = ecoFitRetrofit.create(UserService::class.java)

}