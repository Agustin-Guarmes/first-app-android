package com.curso.android.app.practica.proyecto

import org.junit.Test
import org.junit.Assert.*

class NuevoArchivoUnitTest {

    @Test
    fun testCompareStrings() {
        val string1 = "Hello"
        val string2 = "Hello"

        assertTrue(string1 == string2)
    }

    @Test
    fun testCompareStringsNotEqual() {
        val string1 = "Hello"
        val string2 = "World"

        assertFalse(string1 == string2)
    }
}
