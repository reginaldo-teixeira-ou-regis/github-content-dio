package oop

// Herança.

// Usa-se o "open" na classe ou função que é herdada
open class Dog {
  open fun sayHello() {
    println("wow wow!")
  }
}

// Yorkshire extends Dog
class Yorkshire : Dog() {
  // Usa-se o "override" na função para sobrescrever o metodo herdado.
  override fun sayHello() {
    println("wif wif!")
  }
}

fun main() {
  val dog: Dog = Yorkshire()
  dog.sayHello()
}