package com.example.boredapplication.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.boredapplication.R

data class Page(
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        description = "Doge.",
        image = R.drawable.doge_bread
    ),
    Page(
        description = "More Doge.",
        image = R.drawable.doge
    ),
    Page(
        description = "One more Doge.",
        image = R.drawable.smiley_doge
    )
)