package com.example.notesapp.model


import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("user")
    val user: User?
)