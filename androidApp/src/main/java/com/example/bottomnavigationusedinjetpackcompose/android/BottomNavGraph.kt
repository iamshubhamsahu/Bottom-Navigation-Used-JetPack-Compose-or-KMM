package com.example.bottomnavigationusedinjetpackcompose.android

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationusedinjetpackcompose.android.screen.HomesScreen
import com.example.bottomnavigationusedinjetpackcompose.android.screen.ProfilesScreen
import com.example.bottomnavigationusedinjetpackcompose.android.screen.SettingsScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomesScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfilesScreen()
        }
        composable(route = BottomBarScreen.Setting.route){
            SettingsScreen()
        }
    }


}