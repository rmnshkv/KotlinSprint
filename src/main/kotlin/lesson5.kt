fun canShipSail(damaged: Boolean, crew: Int, provisions: Int, favorableWeather: Boolean): Boolean {
    if (!damaged) {
        if (crew in 55..70 && provisions > 50) {
            return true
        } else if (!damaged && crew == 70 && provisions >= 50 && favorableWeather) {
            return true
        }
    }
    return false
}

fun main() {
    val damaged = readLine()?.equals("да", ignoreCase = true) ?: false
    print("Введите текущий состав экипажа: ")
    val crew = readLine()?.toIntOrNull() ?: 0
    print("Введите количество ящиков с провизией на борту: ")
    val provisions = readLine()?.toIntOrNull() ?: 0
    val favorableWeather = readLine()?.equals("да", ignoreCase = true) ?: false

    if (canShipSail(damaged, crew, provisions, favorableWeather)) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}
