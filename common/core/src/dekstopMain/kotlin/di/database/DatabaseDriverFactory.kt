package di.database

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver
import PlatformConfiguration

internal actual class DatabaseDriverFactory actual constructor(
    private val platformConfiguration: PlatformConfiguration
) {

    actual fun createDriver(schema: SqlDriver.Schema, name: String): SqlDriver =
        JdbcSqliteDriver(
            url = "jdbc:sqlite:$name"
        )

}