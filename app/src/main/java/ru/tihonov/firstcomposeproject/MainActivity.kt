package ru.tihonov.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.tihonov.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import ru.tihonov.firstcomposeproject.ui.theme.MainScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeProjectTheme {
                MainScreen()
            }
        }
    }
}
