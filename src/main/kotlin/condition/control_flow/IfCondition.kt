package condition.control_flow

class IfCondition {
    /*
    * 1.if condtion
    * 2.when expression
    * 3.for loops
    * 4.while loop
    * */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var a = 1
            val max = 10

            //TODO:: 1.tranditional usage
            if (a < max) a = a + 1

            //TODO:: 2.with else
            if (a < max) {
                a += 1
            } else {
                println("Maximum")
            }
        }
    }
}