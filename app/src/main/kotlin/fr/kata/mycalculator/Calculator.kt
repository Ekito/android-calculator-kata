package fr.kata.mycalculator

/**
 * Created by arnaud on 29/05/2017.
 */
class Calculator {

    var current: Int = 0
        private set


    fun addDigit(digit: Int) {
        if (current == 0) {
            current = digit
        } else {
            current = concatDigit(current, digit)
        }
    }

    private fun concatDigit(current: Int, digit: Int): Int {
        val string = "$current$digit"
        return string.toInt()
    }

    fun clear() {
        current = 0
    }
}