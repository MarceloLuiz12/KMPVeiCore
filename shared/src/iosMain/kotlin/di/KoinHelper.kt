package di

import data.local.PreferencesDataStore
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initKoin() {
    startKoin {
        modules(
            listOf(
                domainModule,
                dataModule,
                iosOnlyModule
            )
        )
    }
}

val iosOnlyModule = module {
    factory { PreferencesDataStore() }
}