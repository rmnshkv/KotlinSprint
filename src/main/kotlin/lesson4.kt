fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buff: Double = 0.2

    val crystalOreBuff = crystalOre * buff
    val ironOreBuff = ironOre * buff

    println("Бафф кристаллической руды: ${crystalOreBuff.toInt()}")
    println("Бафф Железной руды: ${ironOreBuff.toInt()}")

}