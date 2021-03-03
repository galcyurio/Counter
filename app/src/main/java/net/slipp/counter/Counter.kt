package net.slipp.counter

import java.util.concurrent.atomic.AtomicLong

class Counter {
    private val _count = AtomicLong()
    val count: Long
        get() = _count.get()

    fun increment(): Boolean {
        _count.incrementAndGet()
        return true
    }

    fun decrement(): Boolean {
        val count = _count.get()
        if (count <= 0) return false

        _count.decrementAndGet()
        return true
    }
}
