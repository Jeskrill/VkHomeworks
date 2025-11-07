package com.example.vkhomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.vkhomework.ui.screens.MainScreen
import com.example.vkhomework.ui.theme.VkHomeworkTheme

class MainActivity : ComponentActivity() {
    private val viewModel: GridViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VkHomeworkTheme {
                MainScreen(viewModel = viewModel)
            }
        }
    }
}

