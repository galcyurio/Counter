package net.slipp.counter

class MainPresenter(
    private val view: MainContract.View
) : MainContract.Presenter {
    private val counter = Counter()

    override fun start() {
        view.showCount(counter.count)
    }

    override fun increment() {
        counter.increment()
        view.showCount(counter.count)
    }

    override fun decrement() {
        counter.decrement()
        view.showCount(counter.count)
    }
}
