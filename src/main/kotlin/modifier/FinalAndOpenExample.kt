package modifier
class Human(val name: String)
/* TODO:: 1.1 class Person cannot override class Human
* class Person(): Human
*/


open class Human1(val name: String)
// TODO:: 2.1 Override open class Human1 and specified explicitly of class member are mutable(var) or immutable(val)
class Person(name: String): Human1(name)

fun main(args: Array<String>) {
    val human = Human("Jack")
    /*TODO:: 1.2 final by default can't visible name
    * human.name
    */

    //TODO:: visible class member when specified explicitly
    val human1 = Human1("Jackle")
    println(human1.name)
}