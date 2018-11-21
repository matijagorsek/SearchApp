package com.example.matija.searchapp.data

import com.google.gson.annotations.SerializedName

data class ProjectsModel(

    val id: Int,
    val type: String,
    val name: String,
    val status: Int,
    val notes: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    val color: String,
    val token: Int,
    @SerializedName("share_mode")
    val shareMode: Int,
    @SerializedName("mail_token")
    val mail_token: String,
    @SerializedName("tasks_active_count")
    val tasksActiveCount: Int,
    @SerializedName("tasks_archive_count")
    val tasksArchiveCount: Int,
    @SerializedName("tasks_trash_count")
    val tasksTrashCount: String,
    @SerializedName("tasks_complete_count")
    val tasksCompleteCount: String,
    @SerializedName("share_token")
    val shareToken: String,
    @SerializedName("share_token_enabled")
    val shareTokenEnabled: Boolean,
    @SerializedName("team_id")
    val teamID: Int

)