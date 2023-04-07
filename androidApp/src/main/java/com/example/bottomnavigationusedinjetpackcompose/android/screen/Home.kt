package com.example.bottomnavigationusedinjetpackcompose.android.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomnavigationusedinjetpackcompose.android.MyApplicationTheme

@Composable
fun HomesScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "HOME",
            fontSize = MaterialTheme.typography.h3.fontSize,
            color = Color.White,
        )
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    MyApplicationTheme {
        HomesScreen()
    }
}