package com.example.api_calling


import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("todos")

    fun getToDoList(): Observable<List<ToDoModel>>

    @GET("Comments")

    fun getCommentsList(): Observable<List<CommentsModel>>

    @GET("Posts")

    fun getPostsList(): Observable<List<PostsModel>>

    @GET("Albums")

    fun getAlbumsList(): Observable<List<AlbumsModel>>

    @GET("Photos")

    fun getPhotosList(): Observable<List<PhotosModel>>

    @GET("Users")

    fun getUsersList(): Observable<List<UsersModel>>

}