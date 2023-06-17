import di.Inject
import di.coreModule
import di.gamesModule
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.direct
import org.kodein.di.singleton

object PlatformSDK {

    fun init(
        configuration: PlatformConfiguration
    ) {
        val umbrellaModule = DI.Module(
            name = "umbrellaModule",
            init = {
                bind<PlatformConfiguration>() with singleton { configuration }
            }
        )
        Inject.createDependencies(
            DI {
                importAll(
                    coreModule,
                    umbrellaModule,
                    gamesModule
                )
            }.direct
        )
    }
}