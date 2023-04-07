package com.example.bottomnavigationusedinjetpackcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform