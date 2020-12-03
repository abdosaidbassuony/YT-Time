package com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.articledetail

import com.example.cleanarchproject.ui.base.BaseViewModel
import com.example.gulftech_androidtask.util.SingleLiveEvent
import com.example.nytimes.data.model.Result

class ArticleDetailsViewModel:BaseViewModel() {
    val getData = SingleLiveEvent<Result>()

    fun getData(data:Result?){
        getData.value = data
    }
}