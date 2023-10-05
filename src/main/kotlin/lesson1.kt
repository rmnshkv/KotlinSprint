fun main() {
 val totalTables = 13
 val occupiedToday = 13
 val occupiedTomorrow = 9
 val resultToday = occupiedToday < ACESSABLE_TABLE
 val resultTomorrow = occupiedTomorrow >= ACESSABLE_TABLE
 println("Доступность столиков на сегодня: $resultToday" +
         "\nДоступность столиков на завтра: $resultTomorrow")
}
const val ACESSABLE_TABLE = 1
