package challenge

data class Country(var population: Double, val growthRate: Double) {
  fun growPopulation() {
    val growthFactor = 1 + (growthRate / 100)
    population *= growthFactor
  }
}

fun main() {
  var populationA: Double
  while (true) {
    print("Insira a população do País A: ")
    try {
      populationA = readLine()!!.toDouble()
      if (populationA < 0) {
        println("Error: população não pode ser negativa.")
        continue
      }
      break
    } catch (e: NumberFormatException) {
      println("Error: por favor insira um número inteiro válido.")
    }
  }

  var populationB: Double
  while (true) {
    print("Insira a população do País B: ")
    try {
      populationB = readLine()!!.toDouble()
      if (populationB < 0) {
        println("Error: população não pode ser negativa.")
        continue
      }
      break
    } catch (e: NumberFormatException) {
      println("Error: por favor insira um número inteiro válido.")
    }
  }

  if (populationA >= populationB) {
    println(
      "Error: a população do país A deve ser menor que a população do país B."
    )
    return
  }

  val countryA = Country(populationA, growthRate = 3.0)
  val countryB = Country(populationB, growthRate = 1.5)

  var numYears = 0
  while (countryA.population < countryB.population) {
    countryA.growPopulation()
    countryB.growPopulation()
    numYears++
  }

  println("$numYears anos")
}
