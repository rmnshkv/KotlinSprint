fun main() {
    var cageletter = "E"
    val cage1 = 2
    val cage2 = 4
    val counter = 1

    println("$cageletter$cage1-$cageletter$cage2;${counter}")

    cageletter = "D"

    while (counter > 0 && cage1 > 0) {
        println("$cageletter$cage1-$cageletter${cage1+1};${counter+1}")
        break
    }
}