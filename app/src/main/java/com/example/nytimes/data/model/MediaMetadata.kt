package com.example.nytimes.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MediaMetadata(
    @SerializedName("format")
    val format: String?= null,
    @SerializedName("height")
    val height: Int?= null,
    @SerializedName("url")
    val url: String?= null,
    @SerializedName("width")
    val width: Int?= null
) : Parcelable