package fluxControl

fun main() {
  // Tipo o ternario do JS == if (a > b) a else b
  fun max(a: Int, b: Int) = if (a > b) a else b
  println(max(99, -42))
}