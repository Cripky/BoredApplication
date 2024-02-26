package com.example.boredapplication.di

import android.app.Application
import com.example.boredapplication.data.manger.LocalUserMangerImpl
import com.example.boredapplication.data.remote.BoredApi
import com.example.boredapplication.data.repository.ActionRepositoryImpl
import com.example.boredapplication.domain.manger.LocalUserManger
import com.example.boredapplication.domain.repository.ActionRepository
import com.example.boredapplication.domain.use_cases.app_entry.AppEntryUseCases
import com.example.boredapplication.domain.use_cases.app_entry.ReadAppEntry
import com.example.boredapplication.domain.use_cases.app_entry.SaveAppEntry
import com.example.boredapplication.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
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

    @Provides
    @Singleton
    fun provideBoredApi(): BoredApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(BoredApi::class.java)
    }

    @Provides
    @Singleton
    fun provideActionRepository(api: BoredApi): ActionRepository {
        return ActionRepositoryImpl(api)
    }
}