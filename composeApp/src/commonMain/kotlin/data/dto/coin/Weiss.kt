package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Weiss(
    @SerialName("MarketPerformanceRating")
    val marketPerformanceRating: String?,
    @SerialName("Rating")
    val rating: String?,
    @SerialName("TechnologyAdoptionRating")
    val technologyAdoptionRating: String?
)