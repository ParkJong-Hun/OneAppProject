package com.example.oneappproejct.api.oneappprojectapi.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val nickname: String,

    @CreationTimestamp
    val created: LocalDateTime,

    @UpdateTimestamp
    val updated: LocalDateTime
)