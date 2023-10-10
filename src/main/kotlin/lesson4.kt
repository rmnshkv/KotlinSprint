fun main() {

    val day = 5
    val arms= day % 2 == 1
    val legs = day % 2 != 1
    val back = day % 2 != 1
    val abs = day % 2 == 1

    println("""Упражнения для рук: $arms
    "Упражнения для ног: $legs
    Упражнения для спины: $back
    Упражнения для пресса: $abs
    """)
}