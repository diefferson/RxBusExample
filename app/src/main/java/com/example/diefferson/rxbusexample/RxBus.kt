package com.example.diefferson.rxbusexample

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

/**
 * Created by diefferson on 04/11/2017.
 */
class RxBus {

    private val bus = PublishSubject.create<Any>()

    fun send(o: Any) {
        bus.onNext(o)
    }

    fun toObservable(): Observable<Any> {
        return bus
    }

    fun <T> toObservable(klazz: Class<T>): Observable<T> {
        return bus.ofType(klazz)
    }

}