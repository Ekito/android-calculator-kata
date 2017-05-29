package fr.kata.mycalculator

/**
 * Created by arnaud on 29/05/2017.
 */
class MainPresenter(private val calculator: Calculator) {

    fun getDisplay() = "${calculator.current}"

    fun addDigit(d: String) {
        val digit = d.toIntOrNull()
        if (digit != null && isValidDigit(digit)) {
            calculator.addDigit(digit)
        } else
            throw IllegalStateException("$d is not a valid digit")
    }

    private fun isValidDigit(digit: Int) = digit in 0..9

    fun clear() {
        calculator.clear()
    }

}