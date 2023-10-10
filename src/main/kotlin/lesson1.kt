fun main() {

 val occupiedToday = 13
 val occupiedTomorrow = 9

 val resultToday = occupiedToday < TOTAL_TABLES
 val resultTomorrow = occupiedTomorrow < TOTAL_TABLES

 println("Доступность столиков на сегодня: $resultToday" +
         "\nДоступность столиков на завтра: $resultTomorrow")
}
const val TOTAL_TABLES = 13
