package com.example.notesapp.model


import com.google.gson.annotations.SerializedName

data class SignInRequest(
    @SerializedName("user")
    val user: UserXX?
)