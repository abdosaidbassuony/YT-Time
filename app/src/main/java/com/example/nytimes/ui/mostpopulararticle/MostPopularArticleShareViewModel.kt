package com.example.nytimes.ui.mostpopulararticle

import com.example.cleanarchproject.ui.base.BaseViewModel
import com.example.gulftech_androidtask.util.SingleLiveEvent
import com.example.nytimes.data.model.Result

class MostPopularArticleShareViewModel : BaseViewModel() {

    val openMostPopularArticleViewed = SingleLiveEvent<Boolean>()

    val openArticleDetails = SingleLiveEvent<Result>()

    init {
        openMostPopularArticleViewed()
    }

    private fun openMostPopularArticleViewed() {
        openMostPopularArticleViewed.value = true
    }

    fun openArticleDetails(data: Result) {
        openArticleDetails.value = data
    }
}