package com.example.oneappproejct.api.oneappprojectapi.entity

import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedBy
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class Comment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val authorId: Long,

    val contents: String,

    val postId: Long,

    @CreatedBy
    val created: Timestamp,

    @UpdateTimestamp
    val updated: Timestamp
)