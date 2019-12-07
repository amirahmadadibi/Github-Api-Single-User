package sanaebadi.info.montagithub

import android.app.Application
import org.koin.core.context.startKoin
import sanaebadi.info.montagithub.di.myModule

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(myModule)
        }
    }
}