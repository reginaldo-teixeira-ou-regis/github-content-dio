package scopeFunctions

// Funções de Escopo: [let].

fun customPrint(s: String) {
  print(s.uppercase())
}

fun main() {
  val empty = "test".let {
    customPrint(it)
    it.isEmpty()
  }
  println(" is empty: $empty")

  fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {
      print("\t")
      customPrint(it)
      println()
    }
  }

  fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString ->       // 5
      strTwo?.let { secondString ->
        customPrint("$firstString : $secondString")
        println()
      }
    }
  }
  printNonNull(null)
  printNonNull("my string")
  printIfBothNonNull("First","Second")
}