package com.example.boredapplication.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.boredapplication.R

data class Page(
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        description = "Do you have free time?",
        image = R.drawable.time
    ),
    Page(
        description = "You don't know what to do?",
        image = R.drawable.thinking
    ),
    Page(
        description = "Try our app and find something you like \uD83D\uDE0A",
        image = R.drawable.medal
    )
)