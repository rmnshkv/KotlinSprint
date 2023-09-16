import kotlin.math.pow

fun main() {

    val depositSum: Int = 70000
    val depositePeriod: Int = 20
    val interestRate: Double = 16.7

    val result = depositSum * ((1 + interestRate/100).pow(depositePeriod))

    println( String.format("%.3f", result))

}