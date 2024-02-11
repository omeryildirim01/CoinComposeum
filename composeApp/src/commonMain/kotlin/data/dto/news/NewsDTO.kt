package data.dto.news


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NewsDTO(
    @SerialName("body")
    val body: String?,
    @SerialName("categories")
    val categories: String?,
    @SerialName("downvotes")
    val downvotes: String?,
    @SerialName("guid")
    val guid: String?,
    @SerialName("id")
    val id: String?,
    @SerialName("imageurl")
    val imageurl: String?,
    @SerialName("lang")
    val lang: String?,
    @SerialName("published_on")
    val publishedOn: Int?,
    @SerialName("source")
    val source: String?,
    @SerialName("source_info")
    val sourceInfo: SourceInfo?,
    @SerialName("tags")
    val tags: String?,
    @SerialName("title")
    val title: String?,
    @SerialName("upvotes")
    val upvotes: String?,
    @SerialName("url")
    val url: String?
)