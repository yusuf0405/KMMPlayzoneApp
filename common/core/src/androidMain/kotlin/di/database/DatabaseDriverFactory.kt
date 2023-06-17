package di.database

import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import PlatformConfiguration

internal actual class DatabaseDriverFactory actual constructor(
    private val platformConfiguration: PlatformConfiguration
) {

    actual fun createDriver(schema: SqlDriver.Schema, name: String): SqlDriver =
        AndroidSqliteDriver(
            schema = schema,
            context = platformConfiguration.androidContext,
            name = name
        )

}