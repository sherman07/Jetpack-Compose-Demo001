package com.example.jetpackcomposedemo001.screen

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = RouteType.HOME_SCREEN.value,
        enterTransition = {
            slideIntoContainer(
                animationSpec = tween(750),
                towards = getRandomDirection()
            )

        }, exitTransition = {
            slideOutOfContainer(
                animationSpec = tween(750),
                towards = getRandomDirection()
            )
        }
///Homework:
//HomeScreen, create another Icon and text next to the current Home icon,
//
//Click new icon , move to a new screen, 
    ) {
        ///register screen

        //home screen
        composable(RouteType.HOME_SCREEN.value) {
            HomeScreen(navController)
        }

        composable(RouteType.SECOND_SCREEN.value) {
            SecondScreen(navController)
        }
        composable(RouteType.THIRD_SCREEN.value) {
            ThirdScreen(navController)
        }

    }
}
private fun getRandomDirection(): AnimatedContentTransitionScope.SlideDirection = when((1..4).random()){
        1 -> AnimatedContentTransitionScope.SlideDirection.Left
        2 -> AnimatedContentTransitionScope.SlideDirection.Right
        3 -> AnimatedContentTransitionScope.SlideDirection.Up
        else -> {AnimatedContentTransitionScope.SlideDirection.Down}
}
