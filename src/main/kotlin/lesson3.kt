fun main() {
    val DepartureHours = 9
    val DepartureMinutes = 39

    val travelTime = 457

    val arrivalTime = (DepartureHours * 60 + DepartureMinutes) + travelTime
    val arrivalHours = arrivalTime / 60
    val arrivalMinutes = arrivalTime % 60

    System.out.printf("%d:%02d", arrivalHours, arrivalMinutes)

}