package scopeFunctions

// Funções de Escopo: [also].

data class Persons(var name: String, var age: Int, var about: String) {
  constructor() : this("", 0, "")
}

fun writeCreationLog(p: Persons) {
  println("A new person ${p.name} was created.")
}

fun main() {
  val jake = Persons("Jake", 30, "Android developer")
    .also {
      writeCreationLog(it)
    }
}