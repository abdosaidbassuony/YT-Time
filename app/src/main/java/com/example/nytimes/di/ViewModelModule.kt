package com.example.gulftech_androidtask.di


import com.example.nytimes.ui.mostpopulararticle.MostPopularArticleShareViewModel
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.allarticle.MostPopularArticleViewModel
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.articledetail.ArticleDetailsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MostPopularArticleShareViewModel() }

    viewModel { MostPopularArticleViewModel(get()) }

    viewModel { ArticleDetailsViewModel() }
}