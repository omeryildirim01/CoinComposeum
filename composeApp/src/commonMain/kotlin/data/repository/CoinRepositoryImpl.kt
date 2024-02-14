package data.repository

import data.dto.coin.VolDTO
import data.dto.news.CoinNewsContainerDTO
import domain.repository.CoinRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import util.Constant.Companion.API_COIN_VOL
import util.Constant.Companion.API_NEWS

class CoinRepositoryImpl(
    private val httpClient: HttpClient
) : CoinRepository {

    override suspend fun getCoinNews(): CoinNewsContainerDTO {
        return httpClient.get(API_NEWS).body<CoinNewsContainerDTO>()
    }

    override suspend fun getCoinVol(): VolDTO {
        return httpClient.get(API_COIN_VOL).body<VolDTO>()
    }


}