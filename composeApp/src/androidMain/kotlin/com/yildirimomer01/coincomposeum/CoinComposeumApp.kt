package com.yildirimomer01.coincomposeum

import android.app.Application
import initKoin
import org.koin.dsl.module

class CoinComposeumApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin{
            it.modules(
                module {
                    single { this@CoinComposeumApp }
                }
            )
        }
    }
}