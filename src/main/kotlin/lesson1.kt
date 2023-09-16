fun main() {

    val time = readLine()!!.toInt()
    val name = "Жора Стасов"

    if (time <= DAY_TIME) {
        println("Добрый день, $name")
    }
    if (time >= EVENING_TIME) {
        println("Добрый Вечер, $name")
    }
}

const val DAY_TIME = 18
const val EVENING_TIME = 19