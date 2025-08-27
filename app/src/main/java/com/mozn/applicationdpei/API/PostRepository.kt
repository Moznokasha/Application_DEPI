package com.mozn.applicationdpei.API

class PostRepository {
    private val api = RetrofitClient.api
    suspend fun getPost() = api.getPost()
}