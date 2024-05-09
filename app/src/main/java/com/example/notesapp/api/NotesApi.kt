package com.example.notesapp.api

import com.example.notesapp.model.SignInRequest
import com.example.notesapp.model.SignUpRequest
import com.example.notesapp.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface NotesApi {
    //signIn
    @POST("users/login")
    suspend fun signIn(@Body signInRequest: SignInRequest) : Response<UserResponse>

    //signUp
    @POST("users")
    suspend fun signUp(@Body signUpRequest: SignUpRequest) : Response<UserResponse>
}