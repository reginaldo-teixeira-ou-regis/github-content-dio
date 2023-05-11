package oop

// Enum tradicional.

// enum class trabalha com estados estaticos constantes
enum class State {
  IDLE, RUNNING, FINISHED
}

//fun challenge.main() {
//  val state = State.RUNNING
//  val message = when (state) {
//    State.IDLE -> "It's idle"
//    State.RUNNING -> "It's running"
//    State.FINISHED -> "It's finished"
//  }
//  println(message)
//}

fun main() {
  val message = when (State.RUNNING) {
    State.IDLE -> "It's idle"
    State.RUNNING -> "It's running"
    State.FINISHED -> "It's finished"
  }
  println(message)
}