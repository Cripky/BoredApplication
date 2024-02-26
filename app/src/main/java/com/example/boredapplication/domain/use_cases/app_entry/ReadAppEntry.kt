package com.example.boredapplication.domain.use_cases.app_entry

import com.example.boredapplication.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReadAppEntry @Inject constructor(
    private val localUserManger: LocalUserManger
) {

    operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }
}