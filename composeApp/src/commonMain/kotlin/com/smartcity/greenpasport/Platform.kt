package com.smartcity.greenpasport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform