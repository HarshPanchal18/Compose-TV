package com.example.movepointer.presentation.preferences.screens

import android.widget.CheckBox
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.tv.material3.LocalContentColor
import androidx.tv.material3.Text
import com.example.movepointer.presentation.data.Preference
import com.example.movepointer.presentation.preferences.PreferencesContainer
import com.example.movepointer.presentation.widgets.Button
import com.example.movepointer.presentation.widgets.Checkbox

@Composable
fun PermissionsScreen() {
    PreferencesContainer(preference = Preference.PERMISSIONS) {
        Column {
            Spacer(modifier = Modifier.size(16.dp))
            Checkbox(
                text = "Disable analytics collection",
                disabledText = "Allow analytics collection"
            ) {}

            Spacer(modifier = Modifier.size(8.dp))
            Checkbox(
                text = "Disable screensaver",
                disabledText = "Enable screensaver"
            ) {}

            Spacer(modifier = Modifier.size(8.dp))
            Checkbox(
                text = "Disable deeplinking",
                disabledText = "Allow deeplinking"
            ) {}

            Spacer(modifier = Modifier.size(32.dp))

            Text(
                text = "Please read following permissions carefully",
                color = LocalContentColor.current.copy(alpha = 0.3f)
            )

            Spacer(modifier = Modifier.size(16.dp))
            Row {
                Button(text = "Save") {}
                Spacer(modifier = Modifier.size(8.dp))
                Button(text = "Cancel") {}
            }
        }
    }
}
