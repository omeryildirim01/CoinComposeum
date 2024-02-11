package presentation.newslist

import domain.model.news.NewsModel
import domain.usecase.GetCoinNewsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope
import util.RequestResult

class NewsListViewModel(
    private val useCase: GetCoinNewsUseCase
) : ViewModel() {
    private val _state = MutableStateFlow<NewsListScreenState> (NewsListScreenState.Loading)
    val state = _state.asStateFlow()

    init {
        getNews()
    }

    private fun getNews() = useCase()
        .onEach {result ->
            when(result) {
                is RequestResult.Error -> {
                    _state.update {
                        NewsListScreenState.Error(result.message)
                    }
                }
                is RequestResult.Loading -> {
                    _state.update {
                        NewsListScreenState.Loading
                    }
                }
                is RequestResult.Success -> {
                    _state.update {
                        NewsListScreenState.ShowData(data = result.data.orEmpty())
                    }
                }
            }
        }
        .launchIn(viewModelScope)

}

sealed class NewsListScreenState {
    data object Loading : NewsListScreenState()
    data class ShowData(val data: List<NewsModel>) : NewsListScreenState()
    data class Error(val error: String) : NewsListScreenState()
}