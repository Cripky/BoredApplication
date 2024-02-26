package com.example.boredapplication.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Action(
    @PrimaryKey val key: Int,
    val activity: String,
    val accessibility: Float,
    val type: String,
    val participants: Int,
    val price: Float,
    val link: String
)
