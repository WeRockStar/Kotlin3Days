package condition.control_flow

class IfCondition {
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