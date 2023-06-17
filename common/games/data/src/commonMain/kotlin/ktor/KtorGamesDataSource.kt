package ktor

import data.KtorBaseApi
import io.ktor.client.HttpClient
import io.ktor.client.request.post
import models.Game

class KtorGamesDataSource(
    val httpClient: HttpClient
) : KtorBaseApi() {

    suspend fun fetchAllGames(): List<Game> {
        return emptyList()
    }

    suspend fun searchGame(query: String): Game {
        return Game(id = String(), title = "Dota 2")
    }
}