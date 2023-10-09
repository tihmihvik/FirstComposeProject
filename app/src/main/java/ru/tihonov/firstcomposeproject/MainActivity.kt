package ru.tihonov.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.tihonov.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import ru.tihonov.firstcomposeproject.ui.theme.PostCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test()
        }
    }
}

@Composable
private fun Test() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "TopAppBar title")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                }
            )
        },
        drawerContent = {
            Text(text = "Text 1")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Text 2")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Text 3")
        },
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    },
                    label = {
                        Text(text = "Favourite")
                    }
                )
                BottomNavigationItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Outlined.Edit, contentDescription = null)
                    },
                    label = {
                        Text(text = "Edit")
                    }
                )
                BottomNavigationItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Outlined.Delete, contentDescription = null)
                    },
                    label = {
                        Text(text = "Delete")
                    }
                )
            }
        }
    ) {
        Text(
            modifier = Modifier.padding(it),
            text = "This is scaffold content"
        )
    }
}
