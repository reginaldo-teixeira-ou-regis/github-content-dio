package oop

// Herança com construtor parametrizado.

open class Tiger(val origin: String) {
  fun sayHello() {
    println("A tiger from $origin says: grrhhh!")
  }
}

class SiberianTiger : Tiger("Siberia")

fun main() {
  val tiger: Tiger = SiberianTiger()
  tiger.sayHello()
}