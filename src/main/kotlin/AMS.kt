fun main(args: Array<String>) {
    for (i in 1..10) {
        println(getFortuneCookie())
    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well."
    )

    print("Enter your birthday:")

    val birthday = readLine()?.toIntOrNull() ?: 0

    val idx = birthday.rem(fortunes.size)

    return fortunes[idx]
}

