package com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.allarticle

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.example.cleanarchproject.ui.base.BaseFragment
import com.example.nytimes.R
import com.example.nytimes.databinding.FragmentMostPoupularArticlBinding
import com.example.nytimes.ui.mostpopulararticle.MostPopularArticleShareViewModel
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.adapter.ItemClickListener
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.adapter.MostPopularArticleViewedAdapter
import org.koin.android.viewmodel.ext.android.sharedViewModel
import org.koin.android.viewmodel.ext.android.viewModel


class MostPopularArticleFragment : BaseFragment<FragmentMostPoupularArticlBinding>() {

    override val viewModel by viewModel<MostPopularArticleViewModel>()

    override val layoutId: Int = R.layout.fragment_most_poupular_articl

    private val sharedViewModel by sharedViewModel<MostPopularArticleShareViewModel>()
    private val mostPopularArticleViewedAdapter by lazy {
        MostPopularArticleViewedAdapter(
            ItemClickListener { position, data ->
                sharedViewModel.openArticleDetails(data)
            }
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        initObservers()
    }

    private fun initObservers() {
        viewModel.articleList.observe(this, Observer {
            mostPopularArticleViewedAdapter.submitList(it)
        })
    }

    private fun setupAdapter() {
        binding.mostViewArticleRecyclerView.itemAnimator = null
        binding.mostViewArticleRecyclerView.adapter = mostPopularArticleViewedAdapter
    }

    companion object {

        fun newInstance() = MostPopularArticleFragment()
    }

}