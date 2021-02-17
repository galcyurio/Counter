package net.slipp.counter

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class CounterTest {
    private lateinit var counter: Counter

    @Before
    fun setUp() {
        counter = Counter()
    }

    @Test
    fun `숫자가 1 증가할 수 있어야 한다`() {
        // when
        counter.increment()

        // then
        assertThat(counter.count).isEqualTo(1)
    }

    @Test
    fun `숫자가 1 감소할 수 있어야 한다`() {
        // when
        counter.decrement()

        // then
        assertThat(counter.count).isEqualTo(-1)
    }

    @Test
    fun `숫자는 0부터 시작한다`() {
        assertThat(counter.count).isEqualTo(0)
    }
}

