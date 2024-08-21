package org.example.iostest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform