package example

fun main(){
    for(i in 1..5) {
        println("i is $i")
    }

    val human = Human()
    human.showName("masao")

    val humanoid = Humanoid("masao")
    humanoid.showName()

    println(map)
    println(map["three"])
}

fun printText() {
    val text = "Hello Kotlin!"
    println(text)
}

fun countLength(str: String): Int{
    return str.length
}

val map: Map<String, String> = mapOf("one" to "1", "two" to "2", "three" to "3")
