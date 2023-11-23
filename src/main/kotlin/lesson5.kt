import kotlin.math.min

fun canShipSail(isDamaged: Boolean, crew: Int, provisions: Int, favorableWeather: Boolean): Boolean {
        if (!isDamaged && crew >= CREW_MIN && crew <= CREW_MAX && provisions > PROVISIONS) {
            return true
        } else if (crew == CREW_MAX && provisions >= PROVISIONS && favorableWeather) {
            return true
        }
    return false
}

fun main() {
    print("Корабль поврежден? да или нет: ")
    val isDamaged = readln().equals("да", ignoreCase = true) ?: false
    print("Введите текущий состав экипажа: ")
    val crew = readLine()?.toIntOrNull() ?: 0
    print("Введите количество ящиков с провизией на борту: ")
    val provisions = readln().toIntOrNull() ?: 0
    print("Багоприятна ли погода? да или нет: ")
    val favorableWeather = readLine()?.equals("да", ignoreCase = true) ?: false

    if (canShipSail(isDamaged, crew, provisions, favorableWeather)) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISIONS = 50