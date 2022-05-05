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

    @Column
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author_id", referencedColumnName = "id")
    val author: User,

    @Column
    @NotNull
    val title: String,

    @Column
    val content: String,

    @CreatedBy
    val created: Timestamp,

    @UpdateTimestamp
    val updated: Timestamp
)