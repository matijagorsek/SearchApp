package com.example.matija.searchapp.data

import com.google.gson.annotations.SerializedName

data class TaskModel(

    val id: Int,
    val name: String,
    val sequence: Int,
    val priority: String,
    val status: Int,
    val repeat: String,
    val notes: String,
    @SerializedName("assigned_to_id")
    val assignedToID: Int,
    @SerializedName("repeat_frequency")
    val repeatFrequency: Int,
    @SerializedName("repeat_interval")
    val repeatInterval: Int,
    @SerializedName("repeat_occurrences")
    val repeatOccurrences: Int,
    val reminder: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("section_id")
    val sectionID: Int,
    val token: String,
    @SerializedName("comments_count")
    val commentsCount: Int,
    @SerializedName("status_changed_by_id")
    val statusChangedByID: Int,
    val due: String,
    @SerializedName("attachments_count")
    val attachmentsCount: Int,
    val closedClItemsCount: Int,
    val totalClItemsCount: Int,
    val statusUpdatedAt: String,
    val metaInformation: String


)