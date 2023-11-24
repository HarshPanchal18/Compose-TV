package com.example.movepointer.presentation.data

object PreferencesData {
    val data by lazy {
        listOf(
            Preference.PROFILE,
            Preference.PERMISSIONS,
            Preference.ABOUT,
            Preference.DELETE_ACCOUNT,
        )
    }
}
