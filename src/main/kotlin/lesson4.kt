fun main() {
    val username = "Zaphod"
    val password = "PanGalactic"

    println("Уважаемый пассажир, введите ваше имя пользователя:")
    val enteredUsername = readln()

    if (enteredUsername == username) {
        println("Введите пароль:")
        val enteredPassword = readln()

        if (enteredPassword == password) {
            println("Ваши данные проверены, и они верны. $username,  вам разрешено входить на борт корабля \"Heart of Gold\"")
        } else {
            println("Неверный пароль. Пожалуйста, попробуйте еще раз или зарегистрируйтесь.")
        }
    } else {
        println("Пользователь $enteredUsername не зарегистрирован. Пожалуйста, зарегистрируйтесь.")

    }
}