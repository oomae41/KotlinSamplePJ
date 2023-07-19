fun main(){
    println("Hello ことりん")
    printText()
    println(countLength("aaa" + "あいうえお"))

    for(i in 1..5) {
        println("i is $i")
    }

    val human = Human()
    human.showName("masao")

    val humanoid = Humanoid("masao")
    humanoid.showName()
}

fun printText() {
    val text = "Hello Kotlin!"
    println(text)
}

fun countLength(str: String): Int{
    return str.length
}