package fr.kata.mycalculator

import org.junit.Assert.assertNotNull
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Created by arnaud on 29/05/2017.
 */
class SampleTest {

    @Test
    fun firstTest(){
        val myMock = mock(Calculator::class.java)

        assertNotNull(myMock)
    }

}