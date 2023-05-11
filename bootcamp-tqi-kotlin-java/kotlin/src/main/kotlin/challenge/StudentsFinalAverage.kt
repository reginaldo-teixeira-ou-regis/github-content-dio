package challenge

fun main() {
  var validInput = false
  var average = 0.0
  while (!validInput) {
    println("Digite a média do aluno:")
    val input = readlnOrNull()
    if (input != null && input.matches("[0-9]+(\\.[0-9]+)?".toRegex())) {
      average = input.toDouble()
      if (average in 0.0..10.0) {
        validInput = true
      } else {
        println("Digite uma média entre 0 e 10.")
      }
    } else {
      println("Digite um número válido.")
    }
  }
  when {
    average < 5 -> println("REP")
    average < 7 -> println("REC")
    else -> println("APR")
  }
}
