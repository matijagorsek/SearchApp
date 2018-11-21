package com.example.matija.searchapp.data

import com.google.gson.annotations.SerializedName

data class SectionModel(

    val id: Int,
    val name: String,
    val indicator: Int,
    val sequence: Int,
    val project_id: Int,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    val status: Int,
    val color: String,
    val description: String

)