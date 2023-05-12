package challenge

fun main() {
  val regex = Regex("""^\d{2}/\d{2}/\d{4}$""")

  println("Digite uma data no formato DD/MM/YYYY:")
  var date: String? = readlnOrNull()
  while (date == null || !regex.matches(date)) {
    println("Formato inválido! Digite novamente no formato DD/MM/YYYY:")
    date = readlnOrNull()
  }

  val (day, month, year) = date.split("/")
  val monthWrittenOut = getMonthWrittenOut(month.toInt())
  println("$day de $monthWrittenOut de $year")
}

fun getMonthWrittenOut(month: Int): String {
  val months = mapOf(
    1 to "Janeiro",
    2 to "Fevereiro",
    3 to "Março",
    4 to "Abril",
    5 to "Maio",
    6 to "Junho",
    7 to "Julho",
    8 to "Agosto",
    9 to "Setembro",
    10 to "Outubro",
    11 to "Novembro",
    12 to "Dezembro"
  ).withDefault { "Mês inválido!" }
  return months[month]!!
}