package com.example.nytimes.ui.mostpopulararticle

import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.Observer
import com.example.cleanarchproject.ui.base.BaseActivity
import com.example.gulftech_androidtask.util.openFragment
import com.example.nytimes.R
import com.example.nytimes.databinding.ActivityMostPopularArticlBinding
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.allarticle.MostPopularArticleFragment
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.articledetail.ArticleDetailsFragment
import org.koin.android.viewmodel.ext.android.viewModel

class MostPopularArticleActivity : BaseActivity<ActivityMostPopularArticlBinding>() {
    override val layoutId: Int = R.layout.activity_most_popular_articl
    override val viewModel by viewModel<MostPopularArticleShareViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initObservers()
    }

    private fun initObservers() {

        viewModel.openMostPopularArticleViewed.observe(this, Observer {
            openFragment(R.id.article_container, MostPopularArticleFragment.newInstance(), true)
        })

        viewModel.openArticleDetails.observe(this, Observer {
            openFragment(R.id.article_container, ArticleDetailsFragment.newInstance(it),true)
        })
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            finish()
        } else {
            supportFragmentManager.popBackStack()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}