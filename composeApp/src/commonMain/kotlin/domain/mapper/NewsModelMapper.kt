package domain.mapper

import data.dto.news.NewsDTO
import domain.model.news.NewsModel

fun NewsDTO.toModel() = NewsModel(
    id = this.id,
    url = this.url,
    title = this.title,
    body = this.body,
    imageUrl = this.imageurl,
    publishedOn = this.publishedOn,
    source = this.source,
    sourceInfo = this.sourceInfo,
    tags = this.tags,
)

fun List<NewsDTO>.toNewsModels() = map {
    it.toModel()
}