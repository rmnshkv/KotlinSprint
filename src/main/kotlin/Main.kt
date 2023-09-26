fun main() {
    var cage1 = "E2"
    var cage2 = "E4"
    val counter = 1

    println("$cage1-$cage2;${counter}")

    cage1 = "D2"
    cage2 = "D4"

   while (counter > 0) {
        println("$cage1-$cage2;${counter+1}")
        break
    }

}