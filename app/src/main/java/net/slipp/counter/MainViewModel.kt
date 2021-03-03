package net.slipp.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val counter = Counter()

    private val _count = MutableLiveData(counter.count)
    val count: LiveData<Long>
        get() = _count

    private val _onDecrementFailed = MutableLiveData<Event<Any>>()
    val onDecrementFailed: LiveData<Event<Any>>
        get() = _onDecrementFailed

    fun increment() {
        counter.increment()
        _count.value = counter.count
    }

    fun decrement() {
        val result = counter.decrement()
        if (result) {
            _count.value = counter.count
        } else {
            _onDecrementFailed.value = Event(Unit)
        }
    }
}
