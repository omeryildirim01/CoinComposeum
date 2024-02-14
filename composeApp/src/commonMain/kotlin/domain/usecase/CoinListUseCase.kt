package domain.usecase

import data.dto.coin.CoinVolDto
import domain.repository.CoinRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import util.RequestResult

class CoinListUseCase(
    private val repository: CoinRepository
) {
    operator fun invoke() = flow<RequestResult<List<CoinVolDto>>> {
        emit(RequestResult.Loading())
        emit(RequestResult.Success(data = repository.getCoinVol().data.orEmpty()))

    }.catch {
        emit(RequestResult.Error(message = it.message.orEmpty()))
    }.flowOn(Dispatchers.IO)
}