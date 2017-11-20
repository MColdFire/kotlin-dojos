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
    val currency = if (currencyPair.first == Money(1, "EUR")) "EUR" else "N/A";
    println(currency)

    val value = when(currencyPair.second.value) {
        1 -> {
            "One"
        }
        100 -> {
            "Hundred"
        }
        20,80 -> {
            "20 or 80"
        }
        in 30..50 -> {
            "30 to 50"
        }
        else -> {
            "Don't care"
        }
    }
    println(value)
}
