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

    fun op_click(view: View) {
        when (view) {
            operator_clear -> {
                presenter.clear()
                updateDisplay()
            }
            else -> Log.i(TAG, "unknown op with $view")
        }
    }

    fun digit_click(view: View) {
        if (view is Button) {
            presenter.addDigit(view.text.toString())
            updateDisplay()
        } else {
            Log.e(TAG, "unknown digit with $view")
        }
    }
}
