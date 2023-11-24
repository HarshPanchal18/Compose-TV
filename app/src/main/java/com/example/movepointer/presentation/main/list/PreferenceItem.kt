package com.example.movepointer.presentation.main.list

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.tv.material3.ClickableSurfaceDefaults
import androidx.tv.material3.ClickableSurfaceScale
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Glow
import androidx.tv.material3.ShapeDefaults
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import com.example.movepointer.presentation.data.Preference

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun PreferenceItem(
    item: Preference,
    onItemClick: (Preference) -> Unit
) {

    Surface(
        onClick = { onItemClick(item) },
        scale = ClickableSurfaceDefaults.scale(focusedScale = 1.05F),
        color = ClickableSurfaceDefaults.color(color = Color.Transparent),
        glow = ClickableSurfaceDefaults.glow(
            focusedGlow = Glow(
                elevation = 5.dp,
                elevationColor = Color.Black
            )
        ),
        shape = ClickableSurfaceDefaults.shape(
            shape = ShapeDefaults.Small,
            focusedShape = ShapeDefaults.Small
        ),
        modifier = Modifier
            .padding(start = 16.dp, bottom = 8.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = item.title,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
        )
    }
}
