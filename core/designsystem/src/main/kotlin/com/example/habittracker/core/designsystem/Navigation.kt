package com.example.habittracker.core.designsystem

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.habittracker.core.designsystem.icon.HabitTrackerIcons
import com.example.habittracker.core.designsystem.theme.HabitTrackerTheme
import com.example.habittracker.core.designsystem.theme.ThemePreviews

/**
 * Habit Tracker navigation bar with content slot. Wraps Material 3 [NavigationBar].
 *
 * @param modifier Modifier to be applied to the navigation bar.
 * @param content Destinations inside the navigation bar. This should contain multiple
 * [NavigationBarItem]s.
 */
@Composable
fun HabitTrackerNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) {
    NavigationBar(
        modifier = modifier,
        contentColor = HabitTrackerNavigationDefaults.navigationContentColor(),
        tonalElevation = 0.dp,
        content = content,
    )
}

/**
 * Habit Tracker navigation bar item with icon and label content slots. Wraps Material 3
 * [NavigationBarItem].
 *
 * @param selected Whether this item is selected.
 * @param onClick The callback to be invoked when this item is selected.
 * @param icon The item icon content.
 * @param modifier Modifier to be applied to this item.
 * @param selectedIcon The item icon content when selected.
 * @param enabled controls the enabled state of this item. When `false`, this item will not be
 * clickable and will appear disabled to accessibility services.
 * @param label The item text label content.
 * @param alwaysShowLabel Whether to always show the label for this item. If false, the label will
 * only be shown when this item is selected.
 */
@Composable
fun RowScope.HabitTrackerNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    selectedIcon: @Composable () -> Unit = icon,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
) {
    NavigationBarItem(
        modifier = modifier,
        enabled = enabled,
        selected = selected,
        onClick = onClick,
        label = label,
        icon = if (selected) selectedIcon else icon,
        alwaysShowLabel = alwaysShowLabel,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = HabitTrackerNavigationDefaults.navigationSelectedItemColor(),
            unselectedIconColor = HabitTrackerNavigationDefaults.navigationContentColor(),
            selectedTextColor = HabitTrackerNavigationDefaults.navigationSelectedItemColor(),
            unselectedTextColor = HabitTrackerNavigationDefaults.navigationContentColor(),
            indicatorColor = HabitTrackerNavigationDefaults.navigationIndicatorColor(),
        ),
    )
}

/**
 * Habit Tracker navigation default values.
 */
object HabitTrackerNavigationDefaults {
    @Composable
    fun navigationContentColor() = MaterialTheme.colorScheme.onSurfaceVariant

    @Composable
    fun navigationSelectedItemColor() = MaterialTheme.colorScheme.onPrimaryContainer

    @Composable
    fun navigationIndicatorColor() = MaterialTheme.colorScheme.primaryContainer
}

//region --- Previews ---
@ThemePreviews
@Composable
fun HabitTrackerNavigationHomeTabSelectedPreview() {
    val items = listOf("Home", "Profile")
    val icons = listOf(
        HabitTrackerIcons.AddUnselected,
        HabitTrackerIcons.PersonUnselected
    )
    val selectedIcons = listOf(
        HabitTrackerIcons.AddSelected,
        HabitTrackerIcons.PersonSelected
    )

    val selectedTabIndex = items.indexOf("Home")

    HabitTrackerTheme {
        HabitTrackerNavigationBar {
            items.forEachIndexed { index, item ->
                HabitTrackerNavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = item,
                        )
                    },
                    selectedIcon = {
                        Icon(
                            imageVector = selectedIcons[index],
                            contentDescription = item,
                        )
                    },
                    label = { Text(item) },
                    selected = index == selectedTabIndex,
                    onClick = { },
                )
            }
        }
    }
}

@ThemePreviews
@Composable
fun HabitTrackerNavigationProfileTabSelectedPreview() {
    val items = listOf("Home", "Profile")
    val icons = listOf(
        HabitTrackerIcons.AddUnselected,
        HabitTrackerIcons.PersonUnselected
    )
    val selectedIcons = listOf(
        HabitTrackerIcons.AddSelected,
        HabitTrackerIcons.PersonSelected
    )

    val selectedTabIndex = items.indexOf("Profile")

    HabitTrackerTheme {
        HabitTrackerNavigationBar {
            items.forEachIndexed { index, item ->
                HabitTrackerNavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = item,
                        )
                    },
                    selectedIcon = {
                        Icon(
                            imageVector = selectedIcons[index],
                            contentDescription = item,
                        )
                    },
                    label = { Text(item) },
                    selected = index == selectedTabIndex,
                    onClick = { },
                )
            }
        }
    }
}
//endregion