package com.example.movepointer.presentation.main.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.foundation.lazy.list.items
import com.example.movepointer.presentation.data.Preference
import com.example.movepointer.presentation.data.PreferencesData
import com.example.movepointer.presentation.main.Heading

@Composable
fun PreferencesList(modifier: Modifier = Modifier, navController: NavHostController) {

    val data = remember { PreferencesData.data }

    Box(
        modifier = modifier
            .fillMaxHeight()
            .background(color = Color.LightGray.copy(0.6F)),
        contentAlignment = Alignment.Center
    ) {
        TvLazyColumn(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(bottom = 120.dp)
                .padding(horizontal = 24.dp)
        ) {
            item {
                Heading()
            }
            items(data) { item ->
                PreferenceItem(item = item) {
                    navController.navigate(it.screen) {
                        //launchSingleTop = true
                        popUpTo(Preference.PROFILE.screen)
                    }
                }
            }
        }
    }
}
