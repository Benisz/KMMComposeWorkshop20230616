package com.example.kmmcomposeworkshop20230616

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform