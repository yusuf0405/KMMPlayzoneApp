package di.database

import com.squareup.sqldelight.db.SqlDriver
import PlatformConfiguration

internal expect class DatabaseDriverFactory constructor(platformConfiguration: PlatformConfiguration) {

    fun createDriver(schema: SqlDriver.Schema, name: String): SqlDriver

}