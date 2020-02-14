//fun getGreeting()= "Hello Kotlin" // single expression function
//
//fun sayHello() {
//    println(getGreeting())
//}

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet") 

fun main() {
    val things = listOf("Kotlin",  "Coding")

    val map = mapOf(1 to "K", 2 to "O", 3 to "T", 4 to "L", 5 to "I", 6 to "N")

    map.forEach {key, value -> println("$key -> $value")}
//    things.forEach { things ->
//        println(things)
//    }
//    sayHello("Hey", "Nate")
//    val things = arrayOf("Kotlin", "Coding", "HelloWRLD")
//    println(things.size)
//    println(things.get(2))
//    println(things[1])

//    for(things in things) {
//        println(things)
//    }

//    things.forEach { things ->
//        println(things)
//    }

//    things.forEachIndexed { index, thing ->
//        println("$thing is at index $index")
//    }
}