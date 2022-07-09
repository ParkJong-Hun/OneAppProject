//package com.example.oneappproejct.api.oneappprojectapi.entity
//
//import org.hibernate.annotations.UpdateTimestamp
//import org.jetbrains.annotations.NotNull
//import org.springframework.data.annotation.CreatedBy
//import java.sql.Timestamp
//import javax.persistence.*
//
//@Entity
//data class Comment(
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long,
//
//    @NotNull
//    val commenter: String,
//
//    val content: String,
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="post_id", referencedColumnName = "id")
//    val postId: Post,
//
//    @CreatedBy
//    val created: Timestamp,
//
//    @UpdateTimestamp
//    val updated: Timestamp
//)