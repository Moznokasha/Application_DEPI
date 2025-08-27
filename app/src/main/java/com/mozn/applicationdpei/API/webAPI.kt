package com.mozn.applicationdpei.API

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface WebAPI {
    @GET("posts")
    suspend fun getPost(): List<Post>

//    @POST("posts")
//    suspend fun cratePost(@Body post: Post): Post
//
//    @POST("posts/{id}")
//    suspend fun updatePost(@Path("id") id: Int, @Body post: Post): Post
//
//    @DELETE ("posts/{id}")
//    suspend fun deletePost(@Path("id")id: Int)
}