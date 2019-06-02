package function


fun main() {
    //TODO: Extension function
    "1".toInt()
    val name = listOf("WeRockStar", "Yao")
    name.map { it.toMr() }
}

fun String.toMr() = "Mr.$this"