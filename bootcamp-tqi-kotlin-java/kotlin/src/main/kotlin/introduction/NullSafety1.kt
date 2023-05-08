package introduction

// Nulidade no Kotlin.

fun main() {
  var neverNull: String = "This can't be null"
  // neverNull = null
  // Não aceita null pois a declaração da var já é string.

  var nullable: String? = "You can keep a null here"
  // nullable = null
  // Declaração da var é string com "?" permitindo ser string ou null.

  var inferredNonNull = "The compiler assumes non-null"
  // inferredNonNull = null
  // O valor da var é uma string por isso não aceita null.

  fun strLength(str: String?): Int {
    return str?.length ?: 0
  }

  println(strLength(neverNull))
  println(strLength(inferredNonNull))
  println(strLength(nullable))
}