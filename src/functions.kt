//fun getGreeting()= "Hello Kotlin" // single expression function
//
//fun sayHello() {
//    println(getGreeting())
//}

fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Nate") = println("$greeting $name")

fun main() {
//    greetPerson()
    val things = arrayOf("Kotlin",  "Coding", "Tutorials")
//    val things = listOf("Kotlin",  "Coding")
//    val things = mutableListOf("Kotlin",  "Coding")
//    things.add("Tutorials")
    sayHello(itemsToGreet = *things, greeting = "Hello")
    val map = mutableMapOf("1 " to " K", "2 " to " O", "3 " to " T", "4 " to " L", "5 " to " I", "6 " to " N")
    map.put("7 ", " T")
    map.put("8 ", " O")
    map.put("9 ", " P")

    map.forEach {key, value -> println("$key->$value")}

    sayHello("Good Morning", *things)
}