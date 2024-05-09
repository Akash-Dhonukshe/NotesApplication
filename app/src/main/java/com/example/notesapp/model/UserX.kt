package com.example.notesapp.model


import com.google.gson.annotations.SerializedName

data class UserX(
    @SerializedName("email")
    val email: String?,
    @SerializedName("password")
    val password: String?,
    @SerializedName("username")
    val username: String?
)