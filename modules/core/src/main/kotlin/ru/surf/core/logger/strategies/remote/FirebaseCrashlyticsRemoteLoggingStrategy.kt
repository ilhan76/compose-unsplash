/**
 * Copyright 2021 Surf LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.surf.core.logger.strategies.remote

import com.google.firebase.crashlytics.FirebaseCrashlytics
import ru.surf.core.logger.RemoteLoggingStrategy

private const val DEFAULT_STRING_VALUE = "null"

private const val DEFAULT_USERNAME_KEY = "username"
private const val DEFAULT_EMAIL_KEY = "email"

/**
 * Logging strategy for Firebase Crashlytics
 */
class FirebaseCrashlyticsRemoteLoggingStrategy : RemoteLoggingStrategy {

    override fun setUser(id: String?, username: String?, email: String?) {
        try {
            FirebaseCrashlytics.getInstance().setUserId(id ?: DEFAULT_STRING_VALUE)
            logKeyValue(DEFAULT_USERNAME_KEY, username)
            logKeyValue(DEFAULT_EMAIL_KEY, email)
        } catch (e: Exception) {
            // ignored
        }
    }

    override fun clearUser() {
        try {
            FirebaseCrashlytics.getInstance().setUserId("")
        } catch (e: Exception) {
            // ignored
        }
    }

    override fun logError(e: Throwable?) {
        try {
            if (e != null) {
                FirebaseCrashlytics.getInstance().recordException(e)
            } else {
                logMessage("FirebaseCrashlytics is ignoring a request to log a null exception.")
            }
        } catch (err: Exception) {
            // ignored
        }
    }

    override fun logMessage(message: String?) {
        try {
            FirebaseCrashlytics.getInstance().log(message ?: DEFAULT_STRING_VALUE)
        } catch (e: Exception) {
            // ignored
        }
    }

    override fun logKeyValue(key: String?, value: String?) {
        try {
            FirebaseCrashlytics.getInstance().setCustomKey(
                key ?: DEFAULT_STRING_VALUE,
                value ?: DEFAULT_STRING_VALUE
            )
        } catch (e: Exception) {
            // ignored
        }
    }
}
