package fr.kata.mycalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName
    val presenter = Injector.presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        updateDisplay()
    }

    private fun updateDisplay() {
        display.text = presenter.getDisplay()
    }

    fun digit_click(view: View) {
        when (view) {
            digit_1, digit_2, digit_3 -> {
                val btn = view as Button
                presenter.addDigit(btn.text.toString())
                updateDisplay()
            }
            else -> Log.i(TAG, "unknown key with $view")
        }
    }
}
