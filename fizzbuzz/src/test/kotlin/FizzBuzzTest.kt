package fizzbuzz

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun should_return_Fizz_for_3() {
        assertThat(fizzBuzz(3), `is`( FIZZ))
    }

    @Test
    fun should_return_Buzz_for_5() {
        assertThat(fizzBuzz(5), `is`( BUZZ))
    }

    @Test
    fun should_return_Buzz_for_10() {
        assertThat(fizzBuzz(10), `is`( BUZZ))
    }

    @Test
    fun should_return_FizzBuzz_for_15() {
        assertThat(fizzBuzz(15), `is`( FIZZBUZZ))
    }

    @Test
    fun should_return_same_number_for_2() {
        assertThat(fizzBuzz(2), `is`( "2"))
    }

}

