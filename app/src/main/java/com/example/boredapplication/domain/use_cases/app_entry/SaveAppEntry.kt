package com.example.boredapplication.domain.use_cases.app_entry

import com.example.boredapplication.domain.manger.LocalUserManger
import javax.inject.Inject

class SaveAppEntry @Inject constructor(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke() {
        localUserManger.saveAppEntry()
    }
}