package fizzbuzz

val FIZZ = "Fizz"
val BUZZ = "Buzz"
val FIZZBUZZ = "FizzBuzz"

fun fizzBuzz(i: Int): String {
    if (multiple_of_5(i) && multiple_of_3(i))
        return FIZZBUZZ
    if (multiple_of_5(i))
        return BUZZ
    if (multiple_of_3(i))
        return FIZZ
    return i.toString()
}

private fun multiple_of_3(i: Int) = i % 3 == 0

private fun multiple_of_5(i: Int) = i % 5 == 0
