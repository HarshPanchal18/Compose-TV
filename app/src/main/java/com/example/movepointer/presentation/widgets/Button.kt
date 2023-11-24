package com.example.movepointer.presentation.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import androidx.tv.material3.Text

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun Button(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    Surface(
        onClick = onClick,
        modifier = modifier,
        tonalElevation = 1.dp
    ) {
        Text(text = text, Modifier.padding(horizontal = 12.dp, vertical = 4.dp))
    }
}
