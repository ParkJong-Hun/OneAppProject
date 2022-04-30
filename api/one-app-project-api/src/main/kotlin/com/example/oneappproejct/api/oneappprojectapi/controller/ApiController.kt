package com.example.oneappproejct.api.oneappprojectapi.controller

import com.example.oneappproejct.api.oneappprojectapi.entity.Post
import org.springframework.stereotype.Controller

@Controller
class ApiController {
    fun createPost() {
    }

    fun getAllPost(): List<Post> {
        return listOf()
    }

    fun getPost(): Post {
        return Post()
    }

    fun putPost() {
    }

    fun deletePost() {
    }

    fun createComment() {
    }

    fun readAllCommentOnPost() {
    }

    fun readComment() {
    }

    fun patchComment() {
    }

    fun deleteComment() {
    }
}