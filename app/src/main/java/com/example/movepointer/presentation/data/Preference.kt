package com.example.movepointer.presentation.data

import com.example.movepointer.presentation.navigation.Preferences

sealed class Preference(val title:String, val screen: String) {
    object PROFILE: Preference("Profile", Preferences.Profile.title)
    object PERMISSIONS: Preference("Permission", Preferences.Permissions.title)
    object ABOUT: Preference("About", Preferences.About.title)
    object DELETE_ACCOUNT: Preference("Logout", Preferences.Logout.title)
}
