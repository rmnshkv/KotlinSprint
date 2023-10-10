fun main() {

    val weatherIsOkay = true
    val tentIsOpen = true
    val airHumidity = 20
    val season = "winter"

    val goodConditions = weatherIsOkay && tentIsOpen && airHumidity == 20 && season == "is not winter"

    println("Благоприятные ли сейчас условия для роста бобовых? $goodConditions")
}