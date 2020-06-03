//internal private
class Person(val firstName: String = "default", val lastName: String = "value") {
    //protected private
    var nickName: String? = null
        set(value) {
            field = value
            println("new nick = $value")
        }
        get() {
            println("Returned: $field")
            return field
        }
    fun printInfo() {
        val check = nickName ?: "No nick"
        println(check)
    }
}