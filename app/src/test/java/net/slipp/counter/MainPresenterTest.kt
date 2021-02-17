package net.slipp.counter

import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var view: MainContract.View
    private lateinit var presenter: MainPresenter

    @Before
    fun setUp() {
        view = mockk(relaxUnitFun = true)
        presenter = MainPresenter(view)
    }

    @Test
    fun `화면이 뜨면 저장된 숫자가 보여야 한다`() {
        // when
        presenter.start()

        // then
        verify { view.showCount(0L) }
    }

    @Test
    fun `Up 버튼을 클릭하면 숫자가 1 증가해야 한다`() {
        // when
        presenter.increment()

        // then
        verify { view.showCount(1L) }
    }

    @Test
    fun `Down 버튼을 누르면 숫자가 1 감소해야 한다`() {
        // when
        presenter.decrement()

        // then
        verify { view.showCount(-1L) }
    }
}
