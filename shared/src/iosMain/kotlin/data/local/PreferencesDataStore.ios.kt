package data.local

import platform.Foundation.NSUserDefaults

actual class PreferencesDataStore {
    private val defaults = NSUserDefaults.standardUserDefaults

    actual suspend fun putString(key: String, value: String) {
        defaults.setObject(value, forKey = key)
    }

    actual suspend fun getString(key: String, default: String): String {
        return defaults.stringForKey(key) ?: default
    }

    actual suspend fun putBoolean(key: String, value: Boolean) {
        defaults.setObject(value, forKey = key)
    }

    actual suspend fun getBoolean(key: String): Boolean {
        return defaults.boolForKey(key)
    }
}