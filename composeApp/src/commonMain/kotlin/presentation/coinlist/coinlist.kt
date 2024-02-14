package presentation.coinlist

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.flow.collectAsStateWithLifecycle
import presentation.component.CoinCard
import presentation.component.ProgressIndicator
import presentation.component.ShowError
import presentation.component.TopBar
import presentation.productlist.ProductListScreenState
import util.Constant

@Composable
fun CoinListScreen(viewModel: CoinListViewModel, onItemClick: (String?) -> Unit) {
    val uiState = viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold(
        topBar = {
            TopBar(
                title = "Top Coins",
            )
        }
    ) {
        when (uiState.value) {
            is CoinListScreenState.Error -> ShowError((uiState.value as CoinListScreenState.Error).error)
            CoinListScreenState.Loading -> ProgressIndicator()
            is CoinListScreenState.CoinData -> {
                LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                    items((uiState.value as CoinListScreenState.CoinData).data) {
                        CoinCard(
                            name = it.coinInfo?.name,
                            id = it.coinInfo?.id,
                            imageUrl = Constant.getMediaUrl(it.coinInfo?.imageUrl.orEmpty()),
                            onItemClick = onItemClick
                        )
                    }
                }

            }
        }
    }

}