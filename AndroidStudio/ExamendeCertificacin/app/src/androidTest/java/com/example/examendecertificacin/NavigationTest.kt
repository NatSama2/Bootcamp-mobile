package com.example.examendecertificacin

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class NavigationTest {

    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testNavigationFromRecyclerViewItem() {

        onView(withId(R.id.horoscopeRecyclerView)).check(matches(isDisplayed()))

        onView(withId(R.id.horoscopeRecyclerView))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.new_screen_layout)).check(matches(isDisplayed()))
    }
}