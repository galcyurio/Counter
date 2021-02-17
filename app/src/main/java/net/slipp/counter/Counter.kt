package net.slipp.counter

import java.util.concurrent.atomic.AtomicLong

class Counter {
    private val _count = AtomicLong()
    val count: Long
        get() = _count.get()

    fun increment() {
        _count.incrementAndGet()
    }

    fun decrement() {
        _count.decrementAndGet()
    }
}
