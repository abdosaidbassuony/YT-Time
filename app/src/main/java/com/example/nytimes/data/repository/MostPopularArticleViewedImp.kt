package com.example.nytimes.data.repository

import com.example.nytimes.data.DataEndPoint
import com.example.nytimes.data.model.MostPopularArticleViewedResponse
import io.reactivex.Single

class MostPopularArticleViewedImp(private val dataEndPoint: DataEndPoint) :
    MostPopularArticleViewedRepository {
    override fun getALLMostPopularArticleViewed(): Single<MostPopularArticleViewedResponse> {
        return dataEndPoint.getALLMostPopularArticleViewed()
    }
}