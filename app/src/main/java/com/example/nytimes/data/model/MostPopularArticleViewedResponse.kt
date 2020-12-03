package com.example.nytimes.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MostPopularArticleViewedResponse(
    @SerializedName("copyright")
    val copyright: String?= null,
    @SerializedName("num_results")
    val numResults: Int?= null,
    @SerializedName("results")
    val results: List<Result>?= null,
    @SerializedName("status")
    val status: String?= null
) : Parcelable