package com.curso.android.app.practica.proyecto

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

@RunWith(AndroidJUnit4::class)
class NuevoArchivoUITest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testCompareStringsInUI() {
        // Realiza acciones en la interfaz de usuario, como escribir en EditText
        onView(withId(R.id.editText1)).perform(typeText("Hello"), closeSoftKeyboard())
        onView(withId(R.id.editText2)).perform(typeText("Hello"), closeSoftKeyboard())
        onView(withId(R.id.compareButton)).perform(click())

        // Verifica que el resultado se muestre correctamente en el TextView
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son iguales")))
    }

    @Test
    fun testCompareStringsNotEqualInUI() {
        // Realiza acciones en la interfaz de usuario, como escribir en EditText
        onView(withId(R.id.editText1)).perform(typeText("Hello"), closeSoftKeyboard())
        onView(withId(R.id.editText2)).perform(typeText("World"), closeSoftKeyboard())
        onView(withId(R.id.compareButton)).perform(click())

        // Verifica que el resultado se muestre correctamente en el TextView
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son diferentes")))
    }
}
