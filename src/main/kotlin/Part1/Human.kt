package Part1

class Human {
    fun showName(name: String) {
        println(name)
    }
}

class Humanoid(val name: String) {
    fun showName(){
        println(name)
    }
}