data class Money(val value: Int)

fun currencyPair(): Pair<Money, Money> {
    return Pair(Money(1), Money(100))
}

object SingletonRates {
    val exchangeRate = 100
}

fun main(args: Array<String>) {
    println(SingletonRates.exchangeRate)

}
