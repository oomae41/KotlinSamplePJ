package Part1

import Part1.Animal

class Dog(name: String) : Animal(name){
    override fun cries() = println("bowbow")
}