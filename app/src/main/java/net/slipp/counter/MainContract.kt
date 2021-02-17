package net.slipp.counter

interface BaseView<T> {
    var presenter: T
}

interface MainContract {
    interface View : BaseView<Presenter> {
        fun showCount(count: Long)
    }

    interface Presenter {
        fun start()
        fun increment()
        fun decrement()
    }
}
