package fr.kata.mycalculator

/**
 * Created by arnaud on 29/05/2017.
 */
object Injector {

    val calculator: Calculator by lazy { Calculator() }

    val presenter: MainPresenter by lazy { MainPresenter(calculator) }

}