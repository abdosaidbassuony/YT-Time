package com.example.gulftech_androidtask.di


import com.example.nytimes.data.repository.MostPopularArticleViewed
import com.example.nytimes.data.repository.MostPopularArticleViewedImp
import org.koin.dsl.module

val repository = module {

    single<MostPopularArticleViewed> {
        MostPopularArticleViewedImp(get())
    }
}