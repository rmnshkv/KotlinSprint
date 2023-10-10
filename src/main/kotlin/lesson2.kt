fun main() {

    val weightLimit = 35..101
    val volumeLimit = 0 until 101

    val weight1 = 20
    val volume1 = 80
    val weight2 = 50
    val volume2 = 100

    val Average1 = weight1 in weightLimit && volume1 in volumeLimit
    val Average2 = weight2 in weightLimit && volume2 in volumeLimit

    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': $Average1")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': $Average2")
}