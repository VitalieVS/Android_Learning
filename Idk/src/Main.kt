fun getName(name: String): String {
    return "Hi $name"
}

fun sayBye(name :String) = "Good bye $name"

fun saySomething(): Unit {
    println("...something")
    //procedura
}

fun nullReturn(): String? {
    return null
}

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

    var map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key -> $value")}
}