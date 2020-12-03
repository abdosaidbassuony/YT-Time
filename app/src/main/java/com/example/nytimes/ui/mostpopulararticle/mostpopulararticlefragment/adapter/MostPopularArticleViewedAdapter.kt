package com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.nytimes.data.model.Result
import com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.viewholder.MostPopularArticleViewedViewHolder

class MostPopularArticleViewedAdapter(private val itemClickListener: ItemClickListener) :
    ListAdapter<Result, MostPopularArticleViewedViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MostPopularArticleViewedViewHolder {
        return MostPopularArticleViewedViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MostPopularArticleViewedViewHolder, position: Int) {
        return holder.bindTo(getItem(position), itemClickListener, position)
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Result>() {
            override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
                return oldItem == newItem
            }
        }
    }
}