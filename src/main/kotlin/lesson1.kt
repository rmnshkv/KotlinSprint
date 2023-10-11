fun main() {

    val number1 = (1..10).random()
    val number2 = (1..10).random()

    println("Для входа решите пример:")
    println("Сколько будет $number1 + $number2")

    val answer = readln().toIntOrNull() ?: 0

    if (answer == number1 + number2) {
        println("Даров, проходи, присаживайся бро)")
    } else {
        println("Не бро, ты робот, сори(")
    }

}