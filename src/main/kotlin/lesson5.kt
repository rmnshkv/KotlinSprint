fun main() {

    val seconds = 6480
    val minutes = (seconds / 60)
    val hours = (minutes / 60f)
    println(minutes)
    println(hours)

    // 108 минут (1.8 часа) = 1 час 48 минут 0 секунд
    val hour = "01"
    val min = "48"
    val sec = "00"

    println("$hour:$min:$sec")
}