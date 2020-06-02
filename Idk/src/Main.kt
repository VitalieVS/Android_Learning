fun getName(name: String): String {
    return "Hi $name"
}

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
}