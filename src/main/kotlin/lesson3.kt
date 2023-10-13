fun main() {

    val firstNumber = 24
    val secondNumber = 7

    println("Привет приятель! Это лотерея!")
    println("Угадай два числа от 0 до 42 и выиграй приз!")

    println("Введи первое число:")
    val userFirstNumber = readln().toIntOrNull()
    println("Введи второе число:")
    val userSecondNumber = readln().toIntOrNull()

    if (userFirstNumber == firstNumber && userSecondNumber == secondNumber ||
        userFirstNumber == secondNumber && userSecondNumber == firstNumber
    ) {
        println("У нас есть победитель! Ты выиграл главный приз!")
    } else if (userFirstNumber == firstNumber || userFirstNumber == secondNumber ||
        userSecondNumber == firstNumber || userSecondNumber == secondNumber
    ) {
        println("Ты одгадал одно из двух чисел, не расстраивайся, для тебя есть утешительный приз!")
    } else {
        println("Неудача. Попробуй снова, в следующий раз повезет!")
    }

    println("Были нужны числа $firstNumber и $secondNumber для победы.")
}