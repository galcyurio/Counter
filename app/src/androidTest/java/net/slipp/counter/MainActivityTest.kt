package net.slipp.counter

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun `Up 버튼을 누르면 숫자 1 증가해야 한다`() {
        // when
        onView(withId(R.id.buttonUp)).perform(click())

        // then
        onView(withId(R.id.textView)).check(matches(withText("1")))
    }

    @Test
    fun `Down 버튼을 누르면 숫자 1 감소해야 한다`() {
        // when
        onView(withId(R.id.buttonUp)).perform(click())
        onView(withId(R.id.buttonDown)).perform(click())

        // then
        onView(withId(R.id.textView)).check(matches(withText("0")))
    }
}
