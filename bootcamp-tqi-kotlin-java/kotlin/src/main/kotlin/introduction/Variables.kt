package introduction

// Variáveis: [var] e [val].

fun example1() {
  var a: String = "initial"
  println(a)
  val b: Int = 1
  val c = 3
}

fun example2() {
  var e: Int = 0
  println(e)
}

fun someCondition() = true

fun example3() {
  val d: Int
  if (someCondition()) {
    d = 1
  } else {
    d = 2
  }
  println(d)
}

fun main() {
  example1()
  example2()
  example3()
}
