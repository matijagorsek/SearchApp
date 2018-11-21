package com.example.matija.searchapp.data

import com.google.gson.annotations.SerializedName

data class PagingModel(

    @SerializedName("total_results")
    val totalResults: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("current_page")
    val currentPage: Int,
    @SerializedName("results_per_page")
    val resultsPerPage: Int

)


