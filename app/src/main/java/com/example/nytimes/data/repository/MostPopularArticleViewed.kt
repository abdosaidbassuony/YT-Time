package com.example.nytimes.data.repository

import com.example.nytimes.data.model.MostPopularArticleViewedResponse
import io.reactivex.Single

interface MostPopularArticleViewed {

    fun getALLMostPopularArticleViewed(): Single<MostPopularArticleViewedResponse>

}