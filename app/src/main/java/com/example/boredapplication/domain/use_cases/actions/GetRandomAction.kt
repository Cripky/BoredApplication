package com.example.boredapplication.domain.use_cases.actions

import com.example.boredapplication.domain.model.Action
import com.example.boredapplication.domain.repository.ActionRepository
import com.example.boredapplication.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRandomAction @Inject constructor(
    private val repository: ActionRepository
) {

    suspend operator fun invoke(): Flow<Resource<Action>> {
        return repository.getRandomAction()
    }
}