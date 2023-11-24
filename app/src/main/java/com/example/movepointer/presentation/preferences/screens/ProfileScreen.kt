package com.example.movepointer.presentation.preferences.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.tv.material3.LocalContentColor
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.example.movepointer.presentation.data.Preference
import com.example.movepointer.presentation.preferences.PreferencesContainer
import com.example.movepointer.presentation.widgets.Button

@Composable
fun ProfileScreen() {
    PreferencesContainer(preference = Preference.PROFILE) {
        ProfileContent()
    }
}

@Composable
fun ProfileContent() {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "User profile",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .shadow(elevation = 12.dp, shape = CircleShape, clip = true)
                    .border(width = 2.dp, color = LocalContentColor.current, shape = CircleShape)
            )
            Spacer(modifier = Modifier.size(20.dp))
            UserDetails()
        }
        Spacer(modifier = Modifier.size(5.dp))
        Row {
            Spacer(modifier = Modifier.size(120.dp))
            Button(text = "Save") {}
            Spacer(modifier = Modifier.size(8.dp))
            Button(text = "Cancel") {}
        }
    }
}

@Composable
fun UserDetails() {
    Column {
        Text(text = "Harsh Panchal",style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = "Android Developer", style = MaterialTheme.typography.labelSmall,
            color = LocalContentColor.current.copy(alpha = 0.4f)
        )
        Text(
            text = "Github: https://github.com/HarshPanchal18",
            style = MaterialTheme.typography.labelSmall,
            color = LocalContentColor.current.copy(alpha = 0.4f)
        )
    }
}
