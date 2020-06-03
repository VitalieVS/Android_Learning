class Person(val firstName: String, val lastName: String) {
//secondary constructor
    init {
    println("1ul")

}
    constructor() :this("Dota", "Pudge") {
        println("2lea construcotr")
}
    init {
        println("2lea")

    }
}