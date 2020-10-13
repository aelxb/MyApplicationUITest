package com.example.myapplication

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(
        MainActivity::class.java
    )
    @Test
    fun testUser(){

        Espresso.onView(withId(activityRule.activity.btnFour.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.btnSecond.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.btnThird.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.btnSeven.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.btnEight.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.btnSix.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.btnFive.id)).perform(click())
        Espresso.onView(withId(activityRule.activity.btnNine.id)).perform(click())
        val expected:String = "Нолики выиграли"
        assertEquals(expected, activityRule.activity.textView.text)
    }
}