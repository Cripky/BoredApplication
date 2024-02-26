package com.example.boredapplication.di

import android.app.Application
import com.example.boredapplication.data.manger.LocalUserMangerImpl
import com.example.boredapplication.domain.manger.LocalUserManger
import com.example.boredapplication.domain.use_cases.app_entry.AppEntryUseCases
import com.example.boredapplication.domain.use_cases.app_entry.ReadAppEntry
import com.example.boredapplication.domain.use_cases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(application: Application): LocalUserManger {
        return LocalUserMangerImpl(application)
    }

    @Provides
    @Singleton
    fun provideAppEntryUseCases(localUserManger: LocalUserManger): AppEntryUseCases {
        return AppEntryUseCases(
            readAppEntry = ReadAppEntry(localUserManger),
            saveAppEntry = SaveAppEntry(localUserManger)
        )
    }
}