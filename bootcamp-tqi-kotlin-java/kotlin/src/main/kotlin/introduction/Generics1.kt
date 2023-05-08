package introduction

// Classes Genéricas.

class MutableStack1<E>(vararg items: E) {

  private val elements = items.toMutableList()

  fun push(element: E) = elements.add(element)

  // Add um item na ultima posição da lista.
  fun peek(): E = elements.last()

  // Remove o ultimo item da lista.
  fun pop(): E = elements.removeAt(elements.size - 1)

  fun isEmpty() = elements.isEmpty()

  fun size() = elements.size

  override fun toString() = "MutableStack1(${elements.joinToString()})"
}


fun main() {
  val stack = MutableStack1("A", "B", "C")
  stack.push("D")
  println(stack)

  println("peek(): ${stack.peek()}")
  println(stack)

  for (i in 1..stack.size()) {
    println("pop(): ${stack.pop()}")
    println(stack)
  }
}