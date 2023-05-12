package oop

// Classes de Dados.

// data class armazena valores
data class User(val name: String, val id: Int) {
  override fun equals(other: Any?) =
    other is User && other.id == this.id
}
fun main() {
  val user = User("Alex", 1)
  println(user)

  val secondUser = User("Alex", 1)
  val thirdUser = User("Max", 2)

  println("user == secondUser: ${user == secondUser}")
  println("user == thirdUser: ${user == thirdUser}")

  // hashCode() function
  println(user.hashCode())
  println(secondUser.hashCode())
  println(thirdUser.hashCode())

  // copy() function
  // copia é uma nova instancia
  println(user.copy())
  println(user === user.copy())
  // copiando, mas mudando atributos especificos
  println(user.copy("Max"))
  println(user.copy(id = 3))

  // outra forma de imprimir os atributos com a função component1()
  println("name = ${user.component1()}")
  println("id = ${user.component2()}")
}