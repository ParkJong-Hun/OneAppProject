package com.example.oneappproejct.api.oneappprojectapi.service

import com.example.oneappproejct.api.oneappprojectapi.dto.UserResponseDto
import com.example.oneappproejct.api.oneappprojectapi.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

class UserService(val repository: UserRepository) {
    fun createUser() : UserResponseDto {
        return UserResponseDto()
    }

    fun getAllUser() : List<UserResponseDto> {
        return listOf()
    }

    fun getUser(id : Long) : UserResponseDto {
        return UserResponseDto()
    }

    fun deleteUser(id: Long) : UserResponseDto {
        return UserResponseDto()
    }
}