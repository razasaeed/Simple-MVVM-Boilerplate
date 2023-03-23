package global.cloud.storage.utils.navigation_utils

import androidx.navigation.NavDirections

sealed class NavigationCommand {
    data class ToDirection(val directions: NavDirections) : NavigationCommand()
    object Back : NavigationCommand()
}