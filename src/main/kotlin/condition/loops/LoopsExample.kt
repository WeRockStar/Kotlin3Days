package condition.loops

class LoopsExample {
    /*TODO::
        1.For loop
        2.difind with out block
        3.for loop use index
        4.for looop value with index
    */

    fun main(args: Array<String>) {
        //TODO:: 1.For loop
        val arrayNumber = arrayOf(1, 2, 3)
        for (number: Int in arrayNumber) {
            println(number)
        }

        //TODO:: 2.difind with out block
        for (number in arrayNumber)
            println(number)

        //TODO:: 3.for loop use index
        for (index in arrayNumber.distinct()) {
            println(arrayNumber[index])
        }

        //TODO:: 4.for looop value with index
        for ((index, value) in arrayNumber.withIndex()) {
            println("Element at $index is $value")
        }
    }

}