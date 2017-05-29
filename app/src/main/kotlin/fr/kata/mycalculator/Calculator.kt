package fr.kata.mycalculator

/**
 * Created by arnaud on 29/05/2017.
 */
class Calculator {

    private var current: Int = 0

    fun getDisplay() = "$current"

    fun addDigit(digit: Int) {
        if (current == 0) {
            current = digit
        } else {
            current = concatDigit(current, digit)
        }
    }

    private fun concatDigit(current: Int, digit: Int): Int {
        val string = current + digit
        return string
    }
}