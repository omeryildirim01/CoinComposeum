package domain.di

import domain.usecase.GetCoinNewsUseCase
import domain.usecase.GetProductListUseCase
import domain.usecase.GetProductUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetProductListUseCase(get()) }
    factory { GetProductUseCase(get()) }

    factory { GetCoinNewsUseCase(get()) }
}