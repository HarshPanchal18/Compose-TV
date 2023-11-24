package com.example.movepointer.presentation.main.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.movepointer.presentation.navigation.PreferencesNavigation

@Composable
fun PreferenceDetail(modifier: Modifier = Modifier,navController: NavHostController) {
    Box(modifier.fillMaxSize()) {
        PreferencesNavigation(navController = navController)
    }
}
