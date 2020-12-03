package com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.allarticle

import android.util.Log
import com.example.cleanarchproject.ui.base.BaseViewModel
import com.example.gulftech_androidtask.util.SingleLiveEvent
import com.example.nytimes.data.model.Result
import com.example.nytimes.data.repository.MostPopularArticleViewed
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MostPopularArticleViewModel(private val repository: MostPopularArticleViewed) :
    BaseViewModel() {

    val articleList = SingleLiveEvent<List<Result>>()

    init {
        getMostPopularArticleViewed()
    }

    private fun getMostPopularArticleViewed() = repository.getALLMostPopularArticleViewed()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe({ response ->
            Log.e("tPopularArticleViewed",response.results.toString())
            articleList.value = response.results
        }, {

        })
}