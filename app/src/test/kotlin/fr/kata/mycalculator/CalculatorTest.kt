package fr.kata.mycalculator

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by arnaud on 29/05/2017.
 */
class CalculatorTest {

    @Before
    fun before() {
    }

    @Test
    fun add_digit() {
        val calculator = Calculator()

        assertEquals(0,calculator.current)

        calculator.addDigit(1)

        assertEquals(1,calculator.current)

        calculator.addDigit(2)

        assertEquals(12,calculator.current)

        calculator.clear()

        assertEquals(0,calculator.current)
    }

}