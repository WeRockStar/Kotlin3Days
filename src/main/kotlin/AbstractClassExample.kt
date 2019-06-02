//TODO:: 1.create abstract class
abstract class Person(val firsname: String, val lastname: String) {
    var age: Int = 40
    fun diaplayFullName() = "My name is $firsname $lastname"


    //TODO:: 4.declare abstract class member(methods and propertise)
    abstract fun displayJob(description: String)
}

//TODO:: 2.implement abstract class
class Developer(firsname: String, lastname: String): Person(firsname, lastname) {

    //TODO:: 5.implement abstract class and abstract member
    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    //TODO:: 3.declarc instance [2]
    val stark = Developer("Tony", "Stark")
    println(stark.diaplayFullName())
    stark.displayJob("I'm full stack programer.")
}

