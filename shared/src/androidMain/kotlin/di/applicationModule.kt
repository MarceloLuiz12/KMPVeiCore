package di

import android.content.Context
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStoreFile
import data.local.LocalConstants
import data.local.PreferencesDataStore
import org.koin.dsl.module

val applicationModule = module {
    single {
        PreferenceDataStoreFactory.create(
            corruptionHandler = ReplaceFileCorruptionHandler(
                produceNewData = { emptyPreferences() }
            ),
            produceFile = { get<Context>().preferencesDataStoreFile(LocalConstants.DATA_STORE_NAME) }
        )
    }
    factory { PreferencesDataStore(get()) }
}