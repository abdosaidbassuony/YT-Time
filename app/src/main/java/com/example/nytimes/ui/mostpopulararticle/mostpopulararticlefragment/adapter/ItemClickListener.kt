package com.example.nytimes.ui.mostpopulararticle.mostpopulararticlefragment.adapter

import com.example.nytimes.data.model.Result

class ItemClickListener(val itemClickListener: (position: Int, data: Result) -> Unit) {
    fun onClick(position: Int, data: Result) = itemClickListener(position, data)
}