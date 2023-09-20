fun main() {
    val departureHours = 9
    val departureMinutes = 39

    val travelTime = 457

    val arrivalTime = (departureHours * 60 + departureMinutes) + travelTime
    val arrivalHours = arrivalTime / 60
    val arrivalMinutes = arrivalTime % 60

    System.out.printf("%d:%02d", arrivalHours, arrivalMinutes)

}