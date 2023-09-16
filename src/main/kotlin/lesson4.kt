fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buff: Double = 0.2

    var crystalOreBuff = crystalOre * buff
    var ironOreBuff = ironOre * buff

    println(crystalOreBuff.toInt())
    println(ironOreBuff.toInt())

    crystalOreBuff = crystalOre + (crystalOre * buff)
    ironOreBuff = ironOre + (ironOre * buff)

    println(crystalOreBuff.toInt())
    println(ironOreBuff.toInt())
}