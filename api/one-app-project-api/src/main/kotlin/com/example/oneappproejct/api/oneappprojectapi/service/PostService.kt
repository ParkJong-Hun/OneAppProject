package com.example.oneappproejct.api.oneappprojectapi.service

import com.example.oneappproejct.api.oneappprojectapi.dto.PostRequestDto
import com.example.oneappproejct.api.oneappprojectapi.dto.PostResponseDto
import com.example.oneappproejct.api.oneappprojectapi.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val postRepository: PostRepository) {
    fun createPost(body: PostRequestDto): PostResponseDto {
        return PostResponseDto()
    }

    fun readAllPost(): List<PostResponseDto> {
        return listOf()
    }

    fun readPost(id: Long): PostResponseDto {
        return PostResponseDto()
    }

    fun updatePost(id: Long, body: PostRequestDto): PostResponseDto {
        return PostResponseDto()
    }

    fun deletePost(id: Long): PostResponseDto {
        return PostResponseDto()
    }
}