import kotlin.random.Random

fun main() {

    val userNumbers = getUserNumbers()

    val matchedNumbers = WINNING_NUMBERS.intersect(userNumbers)
    val numMatches = matchedNumbers.size

    println("Выигрышные числа: $WINNING_NUMBERS")

    when (numMatches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Поздравляем! Вы угадали два числа и выиграли крупный приз!")
        1 -> println("Поздравляем! Вы угадали одно число и получаете утешительный приз!")
        else -> println("К сожалению, вы не угадали ни одного числа. Попробуйте еще раз!")
    }
}

fun generateWinningNumbers(): List<Int> {
    val numbers = mutableListOf<Int>()

    while (numbers.size < 3) {
        val randomNumber = Random.nextInt(0, 43)
        if (!numbers.contains(randomNumber)) {
            numbers.add(randomNumber)
        }
    }
    return numbers
}

fun getUserNumbers(): List<Int> {
    val numbers = mutableListOf<Int>()

    println("Победные числа для провекри: $WINNING_NUMBERS")
    println("\nВведите три числа от 0 до 42:")
    for (i in 1..3) {
        val number = readLine()?.toIntOrNull()
        if (number != null && number in 0..42) {
            numbers.add(number)
        } else {
            val winningNumbers = ""
            println("Некорректный ввод. Попробуйте снова: $WINNING_NUMBERS")
            return getUserNumbers()
        }
    }
    return numbers
}
val WINNING_NUMBERS = generateWinningNumbers()