fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "winter"

    val isGoodConditions = isSunny == IS_SUNNY && isAwningOpen == IS_AWNING_OPEN && airHumidity == AIR_HUMIDITY && season == SEASON

    println("Благоприятные ли сейчас условия для роста бобовых? $isGoodConditions")
}
const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "not winter"