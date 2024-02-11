package domain.usecase

import domain.mapper.toNewsModels
import domain.repository.CoinRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import org.koin.core.component.KoinComponent
import util.RequestResult

class GetCoinNewsUseCase(
    private val repository: CoinRepository
) : KoinComponent {
    operator fun invoke() = flow {
        emit(RequestResult.Loading())
        emit(RequestResult.Success(data = repository.getCoinNews().data?.toNewsModels()))
    }.catch {
        emit(RequestResult.Error(message = it.message.orEmpty()))
    }.flowOn(Dispatchers.IO)
}