package di

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.dsl.module

val domainModule = module {
    single {
        CoroutineScope(Dispatchers.Default + SupervisorJob())
    }
}