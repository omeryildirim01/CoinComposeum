package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VolDTO(
    @SerialName("Data")
    val data: List<CoinVolDto>?,
    @SerialName("HasWarning")
    val hasWarning: Boolean?,
    @SerialName("Message")
    val message: String?,
    @SerialName("MetaData")
    val metaData: MetaData?,
    @SerialName("RateLimit")
    val rateLimit: RateLimit?,
    @SerialName("SponsoredData")
    val sponsoredData: List<String>?,
    @SerialName("Type")
    val type: Int?
)