package fr.kata.mycalculator

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by arnaud on 29/05/2017.
 */
class PresenterTest {

    val presenter = Injector.presenter

    @Before
    fun before() {
        presenter.clear()
    }

    @Test
    fun add_digit() {
        presenter.addDigit("1")

        assertEquals("1", presenter.getDisplay())
    }

    @Test
    fun add_digits() {
        presenter.addDigit("1")
        presenter.addDigit("2")
        presenter.addDigit("3")

        assertEquals("123", presenter.getDisplay())
    }

    @Test
    fun add_digit_and_clear() {
        presenter.addDigit("1")
        presenter.clear()

        assertEquals("0", presenter.getDisplay())
    }

}