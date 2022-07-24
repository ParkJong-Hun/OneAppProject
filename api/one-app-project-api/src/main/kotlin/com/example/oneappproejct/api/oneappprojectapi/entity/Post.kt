package com.example.oneappproejct.api.oneappprojectapi.entity

import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedBy
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val title: String,

    val author_id: Long,

    val contents: String,

    @CreatedBy
    val created: Timestamp,

    @UpdateTimestamp
    val updated: Timestamp
)