package function

fun main() {
    val vat7 = { x: Int, y: Int -> (x + y) * 1.07 }
    val vat10 = { x: Int, y: Int -> (x + y) * 1.10 }

    buy({ x: Int, y: Int -> (x + y) * 1.07 })
}

fun buy(func: (Int, Int) -> Double): Double {
    return func(300, 500)
}
