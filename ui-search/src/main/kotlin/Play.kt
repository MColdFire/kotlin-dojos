data class Money(val value: Int)

fun main(args: Array<String>) {
    val money = Money(value = 100)
    println("I have money " + money.value)
    println("I have money " + money)
    println("I have money $money")
    println("I have money ${money.value}")
}
