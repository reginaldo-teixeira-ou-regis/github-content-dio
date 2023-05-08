package oop

// Classes "Seladas".

sealed class Mammal(val name: String)

class Cat(private val catName: String) : Mammal(catName)
class Human(private val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
  when (mammal) {
    is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
    is Cat -> return "Hello ${mammal.name}"
  }
}

fun main() {
  println(greetMammal(Cat("Snowy")))
}
