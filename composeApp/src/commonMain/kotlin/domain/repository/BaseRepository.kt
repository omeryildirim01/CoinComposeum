package domain.repository

import data.dto.news.CoinNewsContainerDTO
import domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>

    suspend fun getProduct(productId: Int): Product
}

interface CoinRepository {
    suspend fun getCoinNews(): CoinNewsContainerDTO

}