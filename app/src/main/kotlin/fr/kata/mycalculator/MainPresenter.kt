package fr.kata.mycalculator

/**
 * Created by arnaud on 29/05/2017.
 */
class MainPresenter(val calculator: Calculator) {

    fun getDisplay() = calculator.getDisplay()

    fun addDigit(d: String): String {
        val digit = d.toIntOrNull()
        if (digit != null) {
            calculator.addDigit(digit)
            return getDisplay()
        } else
            throw IllegalStateException("$d is not a digit")
    }

}