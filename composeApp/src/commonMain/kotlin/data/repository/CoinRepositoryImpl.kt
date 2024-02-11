package data.repository

import data.dto.news.CoinNewsContainerDTO
import domain.repository.CoinRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class CoinRepositoryImpl(
    private val httpClient: HttpClient
) : CoinRepository {

    override suspend fun getCoinNews(): CoinNewsContainerDTO {
        return httpClient.get(API).body<CoinNewsContainerDTO>()
    }

    companion object {
        private const val API = "https://min-api.cryptocompare.com/data/v2/news/?lang=EN&api_key=7463958b67026be03d7bf537713db2363a6b097cea9938c272e9c4b1b65fef23"
    }
}