package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinDisplay(
    @SerialName("USD")
    val uSD: CoinAsUsd?
)