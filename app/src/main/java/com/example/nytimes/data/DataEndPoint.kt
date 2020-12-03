package com.example.nytimes.data

import com.example.gulftech_androidtask.util.Constance.API_KEY
import com.example.nytimes.data.model.MostPopularArticleViewedResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface DataEndPoint {

    @GET("viewed/1.json")
    fun getALLMostPopularArticleViewed(@Query("api-key") apiKey: String = API_KEY): Single<MostPopularArticleViewedResponse>
}