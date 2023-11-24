package com.example.movepointer.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.movepointer.presentation.preferences.screens.AboutScreen
import com.example.movepointer.presentation.preferences.screens.DeleteAccountScreen
import com.example.movepointer.presentation.preferences.screens.PermissionsScreen
import com.example.movepointer.presentation.preferences.screens.ProfileScreen

@Composable
fun PreferencesNavigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Preferences.Profile.title) {

        composable(Preferences.Profile.title) {
            ProfileScreen()
        }
        composable(Preferences.Permissions.title) {
            PermissionsScreen()
        }
        composable(Preferences.About.title) {
            AboutScreen()
        }
        composable(Preferences.Logout.title) {
            DeleteAccountScreen()
        }
    }
}
