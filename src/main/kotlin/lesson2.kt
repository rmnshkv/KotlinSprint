fun main() {
    val age = readln()!!.toInt()
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val surname1 = "Андреева"
    val surname2 = "Сидорова"
    val age1 = "20"
    val age2 =  "22"

    if (age <= BEFORE_WEDDING) {
        println("$surname1 $name $patronymic, $age1")
    }
    if (age >= AFTER_WEDDING) {
        println("$surname2 $name $patronymic, $age2")
    }
}
const val BEFORE_WEDDING = 21
const val AFTER_WEDDING = 22