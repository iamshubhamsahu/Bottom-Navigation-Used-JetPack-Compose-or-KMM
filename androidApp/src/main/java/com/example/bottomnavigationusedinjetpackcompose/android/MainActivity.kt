package com.example.bottomnavigationusedinjetpackcompose.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomnavigationusedinjetpackcompose.Greeting
import com.example.bottomnavigationusedinjetpackcompose.android.MainScreen
import com.example.bottomnavigationusedinjetpackcompose.android.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
               MainScreen()
            }
        }
    }
}


