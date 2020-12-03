package com.example.nytimes.data.repository

import com.example.nytimes.data.model.MostPopularArticleViewedResponse
import io.reactivex.Single

interface MostPopularArticleViewedRepository {
    fun getALLMostPopularArticleViewed(): Single<MostPopularArticleViewedResponse>
}