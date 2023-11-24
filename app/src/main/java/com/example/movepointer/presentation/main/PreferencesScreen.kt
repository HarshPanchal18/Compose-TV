package com.example.movepointer.presentation.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.example.movepointer.presentation.main.detail.PreferenceDetail
import com.example.movepointer.presentation.main.list.PreferencesList

@Composable
fun PreferencesScreen() {
    val navController = rememberNavController()
    Row {
        PreferenceDetail(modifier = Modifier.weight(1.3F), navController = navController)
        PreferencesList(modifier = Modifier.weight(0.7F), navController = navController)
    }
}

@Composable
fun Heading() {
    Text(
        text = "Preferences",
        modifier = Modifier.padding(16.dp),
        style = MaterialTheme.typography.headlineMedium
    )
}
