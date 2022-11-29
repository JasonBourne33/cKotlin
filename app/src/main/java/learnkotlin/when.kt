package learnkotlin


fun main() {
    val score = getScore("Jim")
    println(score)
    val score2 = getScore2("Tommmmmidjfo")
    println(score2)

    val num = 10
    val num2 = 10L
    checkNumber(num)
    checkNumber(num2)

}

fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    else -> 0
}

fun getScore2(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    else -> 0
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}