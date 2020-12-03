package com.example.nytimes.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Result(
    @SerializedName("abstract")
    val `abstract`: String? = null,
    @SerializedName("adx_keywords")
    val adxKeywords: String? = null,
    @SerializedName("asset_id")
    val assetId: Long? = null,
    @SerializedName("byline")
    val byline: String? = null,
    @SerializedName("des_facet")
    val desFacet: List<String>? = null,
    @SerializedName("eta_id")
    val etaId: Int? = null,
    @SerializedName("geo_facet")
    val geoFacet: List<String>? = null,
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("media")
    val media: List<Media>? = null,
    @SerializedName("nytdsection")
    val nytDsection: String? = null,
    @SerializedName("org_facet")
    val orgFacet: List<String>? = null,
    @SerializedName("per_facet")
    val perFacet: List<String>? = null,
    @SerializedName("published_date")
    val publishedDate: String? = null,
    @SerializedName("section")
    val section: String? = null,
    @SerializedName("source")
    val source: String? = null,
    @SerializedName("subsection")
    val subsection: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("updated")
    val updated: String? = null,
    @SerializedName("uri")
    val uri: String? = null,
    @SerializedName("url")
    val url: String? = null
) : Parcelable