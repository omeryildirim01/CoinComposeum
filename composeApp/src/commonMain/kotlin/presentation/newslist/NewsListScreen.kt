package presentation.newslist

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.flow.collectAsStateWithLifecycle
import presentation.component.NewsCard
import presentation.component.ProgressIndicator
import presentation.component.ShowError
import presentation.component.TopBar

@Composable
fun NewsListScreen(viewModel: NewsListViewModel, onItemClick: (String) -> Unit) {
    val uiState = viewModel.state.collectAsStateWithLifecycle()

    Scaffold(
        topBar = {
            TopBar(
                title = "Top News",
            )
        }
    ) {
        when (uiState.value) {
            is NewsListScreenState.Error -> ShowError((uiState.value as NewsListScreenState.Error).error)
            NewsListScreenState.Loading -> ProgressIndicator()
            is NewsListScreenState.ShowData -> {
                LazyVerticalGrid(columns = GridCells.Fixed(1)) {
                    items((uiState.value as NewsListScreenState.ShowData).data) {
                        NewsCard(news = it, onItemClick = onItemClick)
                    }
                }

            }
        }
    }

}