package com.example.notesapp.model


import com.google.gson.annotations.SerializedName

data class SignUpRequest(
    @SerializedName("user")
    val user: UserX?
)