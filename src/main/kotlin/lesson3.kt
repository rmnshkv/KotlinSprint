fun main() {

    val goodConditions = IS_SUNNY == IS_SUNNY && IS_AWNING_OPEN == IS_AWNING_OPEN && AIR_HUMIDITY == AIR_HUMIDITY && SEASON != SEASON

    println("Благоприятные ли сейчас условия для роста бобовых? $goodConditions")
}
const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "winter"