package di

import di.database.databaseModule
import di.json.serializationModule
import di.ktor.ktorModule
import org.kodein.di.DI

val coreModule = DI.Module("coreModule") {
    importAll(
        ktorModule,
        databaseModule,
        serializationModule,
    )


}