package com.example.oneappproejct.api.oneappprojectapi.entity

import org.hibernate.annotations.UpdateTimestamp
import org.jetbrains.annotations.NotNull
import org.springframework.data.annotation.CreatedBy
import java.sql.Timestamp
import java.time.LocalDate
import javax.persistence.*

@Entity
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @JoinColumn(name="author_id", referencedColumnName = "id")
    val author: User,

    @NotNull
    val title: String,

    val content: String,

    @CreatedBy
    val created: Timestamp,

    @UpdateTimestamp
    val updated: Timestamp
)