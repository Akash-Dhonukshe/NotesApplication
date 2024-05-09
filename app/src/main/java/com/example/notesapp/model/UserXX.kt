package com.example.notesapp.model


import com.google.gson.annotations.SerializedName

data class UserXX(
    @SerializedName("email")
    val email: String?,
    @SerializedName("password")
    val password: String?
)