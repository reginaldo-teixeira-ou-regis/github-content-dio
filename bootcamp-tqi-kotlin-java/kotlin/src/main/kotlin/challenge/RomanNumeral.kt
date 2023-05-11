package challenge

import java.util.*

fun main() {
  val regex = Regex("[IVXLCDM]+")
  val romanSymbols = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
  )

  var romanNumeral: String? = null
  while (romanNumeral == null || !regex.matches(romanNumeral)) {
    print("Digite um numeral romano: ")
    romanNumeral = readlnOrNull()?.uppercase(Locale.getDefault())
    if (romanNumeral != null && !regex.matches(romanNumeral)) {
      println("Digite um numeral romano válido! (Ex: CXLVII === 147)")
    }
  }

  var result = 0
  var previousValue = 0

  for (i in romanNumeral.indices.reversed()) {
    val currentValue = romanSymbols[romanNumeral[i]] ?: 0
    if (currentValue >= previousValue) {
      result += currentValue
    } else {
      result -= currentValue
    }
    previousValue = currentValue
  }

  println(result)
}
