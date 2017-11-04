package com.example.diefferson.rxbusexample

import android.app.Application

/**
 * Created by diefferson on 04/11/2017.
 */

class MyApplication : Application() {

    private var bus: RxBus? = null

    override fun onCreate() {
        super.onCreate()
        bus = RxBus()
    }

    fun bus(): RxBus? {
        return bus
    }

}
