package data.dto.news


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinNewsContainerDTO(
    @SerialName("Data")
    val data: List<NewsDTO>?,
    @SerialName("HasWarning")
    val hasWarning: Boolean?,
    @SerialName("Message")
    val message: String?,
    @SerialName("RateLimit")
    val rateLimit: RateLimit?,
    @SerialName("Type")
    val type: Int?,
    @SerialName("Promoted")
    val promoted: List<String?>?
)