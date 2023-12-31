package com.example.movepointer.presentation.preferences.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.tv.material3.LocalContentColor
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.example.movepointer.presentation.data.Preference
import com.example.movepointer.presentation.preferences.PreferencesContainer

@Composable
fun AboutScreen() {
    PreferencesContainer(preference = Preference.ABOUT) {
        Text(
            text = "Hello! I'm Harsh Panchal,\n A software developer with a passion for open source development. " +
                    "I have a strong background in programming languages and technologies, and I'm constantly learning and improving my skills. " +
                    "I believe in the power of open source development to create innovative solutions and make a positive impact on society. That's why I have contributed to several open source projects, which you can find on my GitHub profile at https://github.com/UmairKhalid786. I'm also active on LinkedIn, where you can learn more about my experience, education, and interests in software development: https://www.linkedin.com/in/HarshPanchal18/ . " +
                    "I'm always looking for new opportunities to collaborate with other developers and create meaningful solutions, so feel free to connect with me on LinkedIn or check out my projects on GitHub.",
            modifier = Modifier,
            color = LocalContentColor.current.copy(0.4F),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
