package condition.control_flow

class WhenExpression {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //TODO:: 1.syntax When Expression
            //TODO:: 2.many case is handle same way with when
            //TODO:: 3.ragne condition in and !in
            //TODO:: 4.when expresstion assign to variable
            //TODO:: 5.when expresstion assign to variable smart cast

            /**
             * 1.syntax When Expression
             */

            val number = 1
            when(number){
                0 -> println("x == 0")
                1 -> println("x == 1")
                2 -> println("x == 2")
                else -> {
                    println("x is neither 1 nor 2")
                }
            }

            /**
             * 2.many case is handle same way with when
             */
            val month = "Jan."
            when(month){
                "Jan.", "Mar." -> println("Day of month ${31}")
                "Apr.", "Jun." -> println("Day of month ${30}")
            }


            /**
             * 3.ragne condition in or !in
             */
            val riskAssessment = 47
            when (riskAssessment) {
                in 1..20 -> println("negligible risk")
                !in 21..40 -> println("minor risk")
                !in 41..60 -> println("major risk")
                else -> println("undefined risk")
            }


            /**
             * 4.when expresstion assign to variable
             */
            val monthId = 1
            val monthName = when(monthId){
                    1 -> "Jan"
                    2 -> "Feb"
                    3 -> "Mar"
                    else -> ""
            }
            println(monthName)

            /**
             * 5.when expresstion assign to variable smart cast
             */
            println(getMonth(1))
            println(getMonth("One"))

        }

        fun getMonth(x: Any) = when(x){
            is Int -> "Number"
            is String -> 1
            else -> {
                print("undefined")
            }
        }
    }
}