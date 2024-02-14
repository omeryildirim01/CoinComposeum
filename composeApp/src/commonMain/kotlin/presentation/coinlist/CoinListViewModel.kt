package presentation.coinlist

import data.dto.coin.CoinVolDto
import domain.usecase.CoinListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope
import util.RequestResult

class CoinListViewModel(
    private val useCase: CoinListUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow<CoinListScreenState>(CoinListScreenState.Loading)
    val uiState: StateFlow<CoinListScreenState> = _uiState.asStateFlow()
    init {
        getCoins()
    }

    private fun getCoins() = useCase().onEach {  result ->
        when(result) {
            is RequestResult.Loading -> {
                _uiState.update {
                    CoinListScreenState.Loading
                }
            }
            is RequestResult.Error -> {
                _uiState.update {
                    CoinListScreenState.Error(error = result.message)
                }
            }
            is RequestResult.Success -> {
                _uiState.update {
                    CoinListScreenState.CoinData(data = result.data.orEmpty())
                }
            }
        }
    }.launchIn(viewModelScope)
}

sealed class CoinListScreenState {
    data object Loading : CoinListScreenState()
    data class CoinData(val data: List<CoinVolDto>) : CoinListScreenState()
    data class Error(val error: String) : CoinListScreenState()
}