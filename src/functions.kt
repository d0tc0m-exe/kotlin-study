//fun getGreeting()= "Hello Kotlin" // single expression function
//
//fun sayHello() {
//    println(getGreeting())
//}

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet") 

fun main() {
    sayHello("Hey", "Nate")
}