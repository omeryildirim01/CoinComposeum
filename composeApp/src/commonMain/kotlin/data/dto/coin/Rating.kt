package data.dto.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Rating(
    @SerialName("Weiss")
    val weiss: Weiss?
)