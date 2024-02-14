package presentation.di

import org.koin.dsl.module
import presentation.coinlist.CoinListViewModel
import presentation.newslist.NewsListViewModel
import presentation.productdetail.ProductDetailViewModel
import presentation.productlist.ProductListViewModel


val presentationModule = module {

    factory { ProductListViewModel(get()) }

    factory { ProductDetailViewModel(get()) }

    factory { NewsListViewModel(get()) }

    factory { CoinListViewModel(get()) }
}