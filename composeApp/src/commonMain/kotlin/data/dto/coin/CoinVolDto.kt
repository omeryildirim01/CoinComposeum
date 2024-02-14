package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinVolDto(
    @SerialName("CoinInfo")
    val coinInfo: CoinInfo?,
)

