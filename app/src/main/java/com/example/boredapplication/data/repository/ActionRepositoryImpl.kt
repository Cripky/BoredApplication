package com.example.boredapplication.data.repository

import com.example.boredapplication.data.remote.BoredApi
import com.example.boredapplication.domain.model.Action
import com.example.boredapplication.domain.repository.ActionRepository
import com.example.boredapplication.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ActionRepositoryImpl @Inject constructor(
    private val api: BoredApi
): ActionRepository {

    override fun getRandomAction(): Flow<Resource<Action>> = flow {
        try {
            emit(Resource.Loading())
            val action = api.getRandomAction()
            emit(Resource.Success(action))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred."))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}