package extensionfunctions

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main(args: Array<String>) {
    val number1 = 5
    val number2 = 10

    println("$number1 is even? ${number1.isEven()}")
    println("$number2 is even? ${number2.isEven()}")
}