package data.local

expect class PreferencesDataStore {
    suspend fun putString(key: String, value: String)
    suspend fun putBoolean(key: String, value: Boolean)
    suspend fun getString(key: String, default: String): String
    suspend fun getBoolean(key: String): Boolean
}