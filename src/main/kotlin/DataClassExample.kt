abstract class DataClassExample {
    //TODO:: 1.declare data class
    //TODO:: 2.view decompile
    //TODO:: 3.compare dataclass with normal class
    //       3.1.use equals
    //       4.2.use hash code
    //TODO:: 4.copy() and destructor() function

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //TODO:: 3.compare dataclass with normal class
            //normal class
            val user1 = User2("jackle", "12345678")
            val user2 = User2("jackle", "12345678")

            println("##### normal class #####")
            println("===== toString() =====")
            println(user1.toString())
            println(user2.toString())
            println("===== hashCode() =====")
            println(user1.hashCode())
            println(user2.hashCode())
            println("===== equals() =====")
            println(user1.equals(user2))
            println("########################")

            //data class
            val userDataClass1 = User("jackle", "12345678")
            val userDataClass2 = User("jackle", "12345678")

            println("##### data class #####")
            println("===== toString() =====")
            println(userDataClass1.toString())
            println(userDataClass2.toString())
            println("===== hashCode() =====")
            println(userDataClass1.hashCode())
            println(userDataClass2.hashCode())
            println("===== equals() =====")
            println(userDataClass1.equals(userDataClass2))
            println("########################")

            //TODO:: 4.
            val userCopy = userDataClass1.copy()
            println(userCopy)
            val (username, password) = userDataClass1
            println("Username $username and Password $password")
        }
    }
}

//TODO:: 1.declare data class
data class User(val username: String, val password: String)

class User2(val username: String, val password: String)