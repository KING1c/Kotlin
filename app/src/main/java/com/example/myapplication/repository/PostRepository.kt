package com.example.myapplication.repository

import androidx.lifecycle.LiveData
import com.example.myapplication.dto.Post

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun likeById(id: Long)
    fun save(post: Post)
    fun removeById(id: Long)
}
