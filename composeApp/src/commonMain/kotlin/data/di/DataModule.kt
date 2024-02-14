package data.di

import data.repository.CoinRepositoryImpl
import data.repository.ProductRepositoryImpl
import domain.repository.CoinRepository
import domain.repository.ProductRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.Configuration
import io.ktor.serialization.kotlinx.json.DefaultJson
import io.ktor.serialization.kotlinx.json.json
import io.ktor.serialization.kotlinx.serialization
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val dataModule = module {
    single<HttpClient> {
        HttpClient {
            install(ContentNegotiation) {
               jsonByIgnore()
            }
        }
    }

    factory<ProductRepository> { ProductRepositoryImpl(get<HttpClient>()) }

    factory<CoinRepository> { CoinRepositoryImpl(get<HttpClient>()) }
}

public fun Configuration.jsonByIgnore(
    json: Json = IgnoreJson,
    contentType: ContentType = ContentType.Application.Json
) {
    serialization(contentType, json)
}

public val IgnoreJson: Json = Json {
    encodeDefaults = true
    isLenient = true
    allowSpecialFloatingPointValues = true
    allowStructuredMapKeys = true
    prettyPrint = false
    useArrayPolymorphism = false
    ignoreUnknownKeys = true
}