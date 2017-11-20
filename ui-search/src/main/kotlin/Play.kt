typealias Currency = String

data class Money(val value: Int, val currency: Currency)

fun currencyPair(): Pair<Money, Money> {
    return Pair(Money(1, "EUR"), Money(100,"USD"))
}
object SingletonRates {
    val exchangeRate = 100
}

fun main(args: Array<String>) {
    val currencyPair = currencyPair()
    println(currencyPair)
}
