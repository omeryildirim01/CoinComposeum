package domain.model.news

import data.dto.news.SourceInfo
data class NewsModel(
    val title: String?,
    val url: String?,
    val body: String?,
    val id: String?,
    val imageUrl: String?,
    val publishedOn: Int?,
    val source: String?,
    val sourceInfo: SourceInfo?,
    val tags: String?,
)