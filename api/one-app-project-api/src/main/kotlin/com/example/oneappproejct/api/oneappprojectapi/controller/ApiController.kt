package com.example.oneappproejct.api.oneappprojectapi.controller

import com.example.oneappproejct.api.oneappprojectapi.dto.CommentResponseDto
import com.example.oneappproejct.api.oneappprojectapi.dto.PostResponseDto
import com.example.oneappproejct.api.oneappprojectapi.repository.CommentRepository
import com.example.oneappproejct.api.oneappprojectapi.repository.PostRepository
import com.example.oneappproejct.api.oneappprojectapi.service.CommentService
import com.example.oneappproejct.api.oneappprojectapi.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

@Controller
class ApiController(
    val postService: PostService,
    val commentService: CommentService
) {
    @PostMapping("/post")
    fun createPost() : ResponseEntity<PostResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @GetMapping("/post")
    fun getAllPost() : ResponseEntity<List<PostResponseDto>> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @GetMapping("/post/{id}")
    fun getPost(@PathVariable("id") id : Long) : ResponseEntity<PostResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @PutMapping("/post/{id}")
    fun putPost(@PathVariable("id") id : Long) : ResponseEntity<PostResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @DeleteMapping("/post/{id}")
    fun deletePost(@PathVariable("id") id : Long) : ResponseEntity<PostResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @PostMapping("/post/{postId}")
    fun createComment(@PathVariable("id") id : Long) : ResponseEntity<CommentResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @GetMapping("/post/{postId}")
    fun readAllCommentOnPost(@PathVariable("postId") postId : Long) : ResponseEntity<CommentResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @GetMapping("/post/{postId}/{commentId}")
    fun readComment(@PathVariable("postId") postId : Long,
                    @PathVariable("commentId") commentId : Long
    ): ResponseEntity<CommentResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @PatchMapping("/post/{postId}/{commentId}")
    fun patchComment(@PathVariable("postId") postId : Long,
                     @PathVariable("commentId") commentId : Long
    ) : ResponseEntity<CommentResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @DeleteMapping("/post/{postId}/{commentId}")
    fun deleteComment(@PathVariable("postId") postId : Long,
                      @PathVariable("commentId") commentId : Long
    ) : ResponseEntity<CommentResponseDto> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }
}