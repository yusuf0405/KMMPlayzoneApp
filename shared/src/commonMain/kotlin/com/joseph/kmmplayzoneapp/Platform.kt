package com.joseph.kmmplayzoneapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform