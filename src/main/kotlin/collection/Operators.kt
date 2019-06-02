package collection

import clazz.Person

fun main() {
    //TODO: Map
    val name = listOf("WeRockStar", "Yao")
    name.map { "Mr.$it" }

    //TODO: Sum
    val number = listOf(1, 2, 3)

    //TODO: FlatMap
    val list = listOf("1", "2", "3", "4")
    val nestedList = listOf(list, list)


    //TODO: Filter, Fist
    val age = listOf(10, 15, 18, 20)

    //TODO .any
    val os = listOf("Android", "iOS", "Windows Phone")

    //TODO: .all
    val person1 = Person("A", 18)
    val person2 = Person("B", 20)
    val persons = listOf(person1, person2)

}