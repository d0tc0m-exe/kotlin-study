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
    val person = classes()
//    person.lastName
//    person.firstName
//    person.nickname = "helloWorld"
//    person.nickname = "byeWorld"
//    println(person.nickname)
    person.printInfo()
}