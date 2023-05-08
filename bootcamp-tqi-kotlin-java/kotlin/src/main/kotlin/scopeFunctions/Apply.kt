package scopeFunctions

// Funções de Escopo: [apply].

data class Person(var name: String, var age: Int, var about: String) {
  constructor() : this("", 0, "")
}

fun main() {

  val jake = Person()
  val stringDescription = jake.apply {
    name = "Jake"
    age = 30
    about = "Android developer"
  }.toString()

  println(stringDescription)
}