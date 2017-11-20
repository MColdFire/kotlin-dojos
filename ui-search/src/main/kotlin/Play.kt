data class Money(val value: Int)

fun currencyPair(): Pair<Money, Money> {
    return Pair(Money(1), Money(100))
}

fun main(args: Array<String>) {
    val currencyPair = currencyPair()
    println(currencyPair)
    println("${currencyPair.first} / ${currencyPair.second}")

    val (firstCurrency, secondCurrency) = currencyPair()
    println("$firstCurrency / $secondCurrency")

    val (_, onlySecondCurrency) = currencyPair()
    println("$onlySecondCurrency")

}
