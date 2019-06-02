package collection

fun main() {

    val numbers = listOf("1", "2", "3", "4", "5", "6", "7", "8")
    val evenNumber = mutableListOf<Int>()
    for (number in numbers) {
        val n = number.toInt()
        if (n % 2 == 0) {
            evenNumber.add(n)
        }
    }
    var sum = 0
    for (number in evenNumber) {
        sum += number
    }

    println(sum)

}