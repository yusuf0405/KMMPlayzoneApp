package di.database

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import PlatformConfiguration

internal actual class DatabaseDriverFactory actual constructor(
    private val platformConfiguration: PlatformConfiguration
) {

    actual fun createDriver(schema: SqlDriver.Schema, name: String): SqlDriver =
        NativeSqliteDriver(
            schema = schema,
            name = name
        )

}