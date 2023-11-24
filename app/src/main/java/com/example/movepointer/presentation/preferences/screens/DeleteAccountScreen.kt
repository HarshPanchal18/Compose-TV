package com.example.movepointer.presentation.preferences.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Text
import com.example.movepointer.presentation.data.Preference
import com.example.movepointer.presentation.preferences.PreferencesContainer
import com.example.movepointer.presentation.widgets.Button

@Composable
fun DeleteAccountScreen() {
    PreferencesContainer(preference = Preference.DELETE_ACCOUNT) {
        Column {
            Text("Are you sure you want to delete your account ?", color = Color.Red.copy(0.7F))
            Spacer(modifier = Modifier.size(24.dp))
            Row {
                Button(text = "Delete") {

                }
                Spacer(modifier = Modifier.size(8.dp))
                Button(text = "Disable") {}
            }
        }
    }
}
