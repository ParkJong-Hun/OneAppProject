package com.example.oneappproejct.api.oneappprojectapi.service

import com.example.oneappproejct.api.oneappprojectapi.dto.CommentRequestDto
import com.example.oneappproejct.api.oneappprojectapi.dto.CommentResponseDto
import com.example.oneappproejct.api.oneappprojectapi.repository.CommentRepository
import org.springframework.stereotype.Service

@Service
class CommentService(val commentRepository: CommentRepository) {
    fun createComment(id: Long, body: CommentRequestDto): CommentResponseDto {
        return CommentResponseDto()
    }

    fun readAllCommentOnPost(id: Long): List<CommentResponseDto> {
        return listOf()
    }

    fun readComment(postId: Long, commentId: Long): CommentResponseDto {
        return CommentResponseDto()
    }

    fun updateComment(postId: Long, commentId: Long, body: CommentRequestDto): CommentResponseDto {
        return CommentResponseDto()
    }

    fun deleteComment(postId: Long, commentId: Long): CommentResponseDto {
        return CommentResponseDto()
    }
}