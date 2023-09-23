fun main() {
    val number = 6!!
    val multiplicationTable = when(number) {
        1 -> {
            println("1*1=1")
            println("1*2=2")
            println("1*3=3")
            println("1*4=4")
            println("1*5=5")
            println("1*6=6")
            println("1*7=7")
            println("1*8=8")
            "1*9=9"
        }
        2 -> {
            println("2*1=2")
            println("2*2=4")
            println("2*3=6")
            println("2*4=8")
            println("2*5=10")
            println("2*6=12")
            println("2*7=14")
            println("2*8=16")
            "2*9=18"
        }
        3 -> {
            println("3*1=3")
            println("3*2=6")
            println("3*3=9")
            println("3*4=12")
            println("3*5=15")
            println("3*6=18")
            println("3*7=21")
            println("3*8=24")
            "3*9=27"
        }
        4 -> {
            println("4*1=4")
            println("4*2=8")
            println("4*3=12")
            println("4*4=16")
            println("4*5=20")
            println("4*6=24")
            println("4*7=28")
            println("4*8=32")
            "4*9=36"
        }
        5 -> {
            println("5*1=5")
            println("5*2=10")
            println("5*3=15")
            println("5*4=20")
            println("5*5=25")
            println("5*6=30")
            println("5*7=35")
            println("5*8=40")
            "5*9=45"
        }

        else -> "Введите число от 1 до 5"
    }
    println(multiplicationTable)
}
