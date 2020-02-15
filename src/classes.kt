 class classes(val firstName: String = "Peter", val lastName: String = "Parker") {
//    val firstName: String = _firstName
//    val lastName: String = _lastName

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }

//    init {
//        println("init 1")
//    }
//
//    constructor(): this("Peter", "Parker") {
//        println("secondary constructor")
//    }
//
//    init {
//        println("init 2")
//    }

    var nickname: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }

    fun printInfo() {
        val nicknameToPrint = nickname ?: "no nickname"
        println("$firstName ($nicknameToPrint) $lastName")
    }
}