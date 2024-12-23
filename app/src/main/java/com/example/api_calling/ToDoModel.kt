package com.example.api_calling

data class ToDoModel(
    val userId:Int? = null,
    val id:Int? = null,
    val title:String?=null,
    val completed:Boolean?=null
)
