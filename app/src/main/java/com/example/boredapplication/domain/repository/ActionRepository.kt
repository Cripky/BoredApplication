package com.example.boredapplication.domain.repository

import com.example.boredapplication.domain.model.Action
import com.example.boredapplication.util.Resource
import kotlinx.coroutines.flow.Flow

interface ActionRepository {

    fun getRandomAction(): Flow<Resource<Action>>
}