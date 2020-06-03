interface PersonInfo {
    fun printInfo(person: Person)
}

class Info : PersonInfo{
    override fun printInfo(person: Person) {
        println("go")
        person.printInfo()
    }
}

fun main() {
    val infoProv = Info()
    infoProv.printInfo(Person())
}