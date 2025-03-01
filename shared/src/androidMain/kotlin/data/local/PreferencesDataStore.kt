package data.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map

actual class PreferencesDataStore(private val dataStore: DataStore<Preferences>) {

    actual suspend fun putString(key: String, value: String) {
        val dataKey = stringPreferencesKey(key)
        dataStore.edit { preferences ->
            preferences[dataKey] = value
        }
    }

    actual suspend fun getString(key: String, default: String): String {
        val dataKey = stringPreferencesKey(key)
        return dataStore.data.map { preferences ->
            preferences[dataKey] ?: default
        }.firstOrNull().orEmpty()
    }

    actual suspend fun putBoolean(key: String, value: Boolean) {
        val dataKey = booleanPreferencesKey(key)
        dataStore.edit { preferences ->
            preferences[dataKey] = value
        }
    }

    actual suspend fun getBoolean(key: String,): Boolean {
        val dataKey = booleanPreferencesKey(key)
        return dataStore.data.map { preferences ->
            preferences[dataKey]
        }.firstOrNull() ?: false
    }
}