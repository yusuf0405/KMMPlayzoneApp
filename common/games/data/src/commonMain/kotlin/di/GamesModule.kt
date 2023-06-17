package di

import GamesRepository
import ktor.KtorGamesDataSource
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.provider
import org.kodein.di.singleton
import repository.GamesRepositoryImpl
import sqldelight.SqlDelightDataSource

val gamesModule = DI.Module("di.getGamesModule") {

    bind<KtorGamesDataSource>() with provider {
        KtorGamesDataSource(httpClient = instance())
    }
    bind<SqlDelightDataSource>() with provider {
        SqlDelightDataSource()
    }

    bind<GamesRepository>() with singleton {
        GamesRepositoryImpl(
            remoteDataSource = instance(),
            localDataSource = instance()
        )
    }
}