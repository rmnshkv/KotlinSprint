fun main() {
    val seconds = 6480

    val hour = seconds / 3600
    val minute = (seconds % 3600) / 60
    val second = seconds % 60

    println (String.format("%02d:%02d:%02d", hour, minute, second))

}