package org.nameless.gamespace.utils.di

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.nameless.gamespace.data.AppSettings
import org.nameless.gamespace.data.SystemSettings
import org.nameless.gamespace.utils.GameModeUtils
import org.nameless.gamespace.utils.ScreenUtils


@EntryPoint
@InstallIn(SingletonComponent::class)
interface ServiceViewEntryPoint {
    fun appSettings(): AppSettings
    fun systemSettings(): SystemSettings
    fun screenUtils(): ScreenUtils
    fun gameModeUtils(): GameModeUtils
}
