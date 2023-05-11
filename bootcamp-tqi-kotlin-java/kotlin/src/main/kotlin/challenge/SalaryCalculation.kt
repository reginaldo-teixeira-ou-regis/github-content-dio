package challenge

object FederalRevenue {
  fun calculateTax(salary: Double): Double {
    return when {
      salary <= 1100 -> salary * 0.05
      salary <= 2500 -> salary * 0.10
      else -> salary * 0.15
    }
  }
}

fun main() {
  var salaryValue: Double?
  var benefitsValue: Double?

  do {
    print("Digite o valor bruto do salario: ")
    salaryValue = readLine()?.toDoubleOrNull()
    if (salaryValue == null || salaryValue < 0) {
      println("Valor invalido, o valor deve ser um numero positivo.")
    }
  } while (salaryValue == null || salaryValue < 0)

  do {
    print("Digite o valor adicional dos beneficios: ")
    benefitsValue = readLine()?.toDoubleOrNull()
    if (benefitsValue == null || benefitsValue < 0) {
      println("Valor invalido, o valor deve ser um numero positivo.")
    }
  } while (benefitsValue == null || benefitsValue < 0)

  val taxValue = FederalRevenue.calculateTax(salaryValue)
  val netSalary = salaryValue - taxValue + benefitsValue

  println("O salario liquido é: R$ %.2f".format(netSalary))
}
