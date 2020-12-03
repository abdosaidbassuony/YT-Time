package com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nytimes.data.model.Result
import com.example.nytimes.databinding.ArticleItemBinding
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.adapter.ItemClickListener

class MostPopularArticleViewedViewHolder(private val binding: ArticleItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindTo(result: Result, itemClickListener: ItemClickListener, position: Int) {
        binding.abstractText.text = result.abstract
        binding.byLineText.text = result.byline
        binding.sectionText.text = result.section
        binding.publishedDate.text = result.publishedDate
        itemView.setOnClickListener {
            itemClickListener.itemClickListener(position, result)
        }

    }

    companion object {
        fun from(parent: ViewGroup): MostPopularArticleViewedViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ArticleItemBinding.inflate(layoutInflater, parent, false)
            return MostPopularArticleViewedViewHolder(binding)
        }
    }
}