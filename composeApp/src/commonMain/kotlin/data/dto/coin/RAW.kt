package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RAW(
    @SerialName("USD")
    val uSD: USDX?
)