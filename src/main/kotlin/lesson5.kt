fun main() {

    val string = "D2-D4;0"
    val parts = string.split("-", ";")

    val firstMove = parts[0]
    println(firstMove)
    val secondMove = parts[1]
    println(secondMove)
    val numberOfMove = parts[2]
    println(numberOfMove)

}