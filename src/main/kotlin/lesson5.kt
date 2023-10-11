fun canShipSail(damaged: Boolean, crew: Int, provisions: Int, favorableWeather: Boolean): Boolean {
        if (!damaged && crew in 55..70 && provisions > 50) {
            return true
        } else if (crew == 70 && provisions >= 50 && favorableWeather) {
            return true
        }
    return false
}

fun main() {
    val damaged = readln().equals("да", ignoreCase = true) ?: false
    print("Введите текущий состав экипажа: ")
    val crew = readLine()?.toIntOrNull() ?: 0
    print("Введите количество ящиков с провизией на борту: ")
    val provisions = readln().toIntOrNull() ?: 0
    val favorableWeather = readLine()?.equals("да", ignoreCase = true) ?: false

    if (canShipSail(damaged, crew, provisions, favorableWeather)) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}
