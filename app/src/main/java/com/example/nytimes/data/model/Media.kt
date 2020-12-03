package com.example.nytimes.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Media(
    @SerializedName("approved_for_syndication")
    val approvedForSyndication: Int?= null,
    @SerializedName("caption")
    val caption: String?= null,
    @SerializedName("copyright")
    val copyright: String?= null,
    @SerializedName("media-metadata")
    val mediaMetadata: List<MediaMetadata>?= null,
    @SerializedName("subtype")
    val subtype: String?= null,
    @SerializedName("type")
    val type: String?= null
) : Parcelable