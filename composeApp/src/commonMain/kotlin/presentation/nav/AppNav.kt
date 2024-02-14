package presentation.nav

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.koin.koinViewModel
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import presentation.coinlist.CoinListScreen
import presentation.coinlist.CoinListViewModel
import presentation.newsdetail.NewsDetailScreen
import presentation.newslist.NewsListScreen
import presentation.newslist.NewsListViewModel
import presentation.productdetail.ProductDetailScreen
import presentation.productdetail.ProductDetailViewModel
import presentation.productlist.ProductListScreen
import presentation.productlist.ProductListViewModel

@Composable
fun AppNavigation() {

    val navigator = rememberNavigator()
    Scaffold {
        NavHost(navigator = navigator, initialRoute = NavigationRoute.CoinList.route) {

            scene(route = NavigationRoute.CoinList.route) {
                val viewModel: CoinListViewModel = koinViewModel(CoinListViewModel::class)
                CoinListScreen(viewModel) {

                }
            }


            scene(route = NavigationRoute.NewsList.route) {
                val viewModel: NewsListViewModel = koinViewModel(NewsListViewModel::class)
                NewsListScreen(viewModel) {

                }
            }

            scene(route = NavigationRoute.NewsDetail.route) {
                val url = it.path
                val viewModel: ProductDetailViewModel = koinViewModel(ProductDetailViewModel::class)
                NewsDetailScreen(url)
            }

            scene(route = NavigationRoute.ProductList.route) {
                val viewModel: ProductListViewModel = koinViewModel(ProductListViewModel::class)
                ProductListScreen(viewModel) {
                    navigator.navigate(NavigationRoute.ProductDetail.getRoute(it))
                }
            }

            scene(route = NavigationRoute.ProductDetail.route) {
                val id = it.path.filter { p -> p.isDigit() }
                val viewModel: ProductDetailViewModel = koinViewModel(ProductDetailViewModel::class)
                ProductDetailScreen(navigator, viewModel, id.toInt())
            }
        }
    }





}

sealed class NavigationRoute(val route: String) {

    data object CoinList : NavigationRoute("/coin_list")

    data object NewsList : NavigationRoute("/news_list")

    data object NewsDetail : NavigationRoute("/news_detail/{url}") {
        fun getRoute(url: String) = "/news_detail/${url}"
    }

    data object ProductList : NavigationRoute("/product_list")

    data object ProductDetail : NavigationRoute("/product_detail/{id}") {
        fun getRoute(id: Int) = "/product_detail/${id}"
    }
}