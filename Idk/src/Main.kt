fun getName(name: String): String {
    return "Hi $name"
}

fun sayBye(name :String) = "Good bye $name"

fun saySomething(): Unit {
    println("...something")
    //procedura
}

fun sayHelloArg(greet: String, vararg items:String) {
    items.forEach{ value ->
        println("Hi $value")}
}

fun sayHello(items:List<String>):Unit {
    items.forEach{ value ->
    println("Hi $value")}
}

fun nullReturn(): String? {
    return null
}

fun greetSomeone(greet: String = "Hello", name: String = "User") = println("$greet $name")

//single expr function

fun sayHi() = "Hey"

fun main() {
    var name: String? = "Naasfds"
    name = "dsfdffgds"

    println(name)
    if (name != null) {
        println("not")
    } else {
        println("null")
    }

    when (name) {
        null -> println("It's null")
        else -> println(name)
    }
    println(name)

   //name = null

    val valueToPrint = when (name) {
        null -> println()
        else -> println(getName(name))
    }
    saySomething()
    println(sayHi())
    println(sayBye(name))

    var things = arrayOf("Dota2", "Programming", "...etc")
    println(things.size)
    println(things[0])
    println(things.get(0))
    for (thing in things) {
        println(thing)
    }
    things.forEach { value ->
        println(value)
        println("------")
    }
    things.forEachIndexed { index, s ->
        println("Index: $index == $s")
    }
    //sayHello(things)
    sayHelloArg("hey" , *things)

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map[4] = "d"
    map.forEach { (key, value) -> println("$key -> $value")}
    greetSomeone(name = "Ion", greet = "Salut")
}