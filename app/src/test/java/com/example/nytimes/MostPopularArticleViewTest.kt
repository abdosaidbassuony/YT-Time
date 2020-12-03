package com.example.nytimes

import com.example.nytimes.data.model.MostPopularArticleViewedResponse
import com.example.nytimes.data.repository.MostPopularArticleViewedRepository
import io.reactivex.Single
import org.junit.Assert
import org.junit.Test

class MostPopularArticleViewTest {
    @Test
    fun `getALLMostPopularArticleViewed() with successful Result then return Single MostPopularArticleViewedResponse`() {
        //arrange
        val repository = object : MostPopularArticleViewedRepository {
            override fun getALLMostPopularArticleViewed(): Single<MostPopularArticleViewedResponse> {

                return Single.just(MostPopularArticleViewedResponse())
            }
        }

        //act
        val result = repository.getALLMostPopularArticleViewed().blockingGet()

        //assert
        val expected = MostPopularArticleViewedResponse()
        Assert.assertEquals(expected, result)

    }

    @Test(expected = java.lang.RuntimeException::class)
    fun `getALLMostPopularArticleViewed() with fail request`() {
        //arrange
        val repository = object : MostPopularArticleViewedRepository {
            override fun getALLMostPopularArticleViewed(): Single<MostPopularArticleViewedResponse> {
                throw RuntimeException()
            }
        }

        //act
        repository.getALLMostPopularArticleViewed().blockingGet()


    }
}