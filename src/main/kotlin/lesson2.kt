fun main() {

    val year = readln().toInt()
    val currentYear = 2023
    val age = currentYear - year

    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    if (age < AGE_OF_MAJORITY) {
        print("Доступно только для лиц старше 18 лет")
    }

}
const val AGE_OF_MAJORITY = 18