package com.example.boredapplication.presentation.navgraph

sealed class Route(val route: String) {

    object OnBoardingScreen: Route(route = "onBoardingScreen")

    // sub navigation
    object AppStartNavigation: Route( route = "appStartNavigation")

    object ActionNavigation: Route(route = "actionNavigation")
}