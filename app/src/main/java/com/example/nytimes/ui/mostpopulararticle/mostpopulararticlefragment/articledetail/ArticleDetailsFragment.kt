package com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.articledetail

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.cleanarchproject.ui.base.BaseFragment
import com.example.nytimes.R
import com.example.nytimes.data.model.Result
import com.example.nytimes.databinding.FragmentArticleDetailsBinding
import org.koin.android.viewmodel.ext.android.viewModel


class ArticleDetailsFragment : BaseFragment<FragmentArticleDetailsBinding>() {

    override val viewModel by viewModel<ArticleDetailsViewModel>()
    override val layoutId: Int = R.layout.fragment_article_details


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getArgument()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initObserver()
    }

    private fun getArgument() {
        val data: Result? = arguments?.getParcelable(RESULT_DATA)
        viewModel.getData(data)
    }

    private fun initObserver() {
        viewModel.getData.observe(this, Observer {
            setupView(it)
        })
    }

    private fun setupView(data: Result) {
        Glide.with(this).load(data.media?.first()?.mediaMetadata?.first()?.url)
            .into(binding.articleImage)
        binding.articleAbstractText.text = data.abstract
        binding.articleTitleText.text = data.title
        binding.articleByLineText.text = data.byline
    }

    companion object {
        private const val RESULT_DATA = "RESULT_DATA"
        fun newInstance(data: Result) =
            ArticleDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(RESULT_DATA, data)
                }
            }
    }

}