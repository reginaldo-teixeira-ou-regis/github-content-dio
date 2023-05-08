package fluxControl

// Estruturas de repetição/loop [while] e [do-while].

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
  var cakesEaten = 0
  var cakesBaked = 0

  while (cakesEaten < 5) {
    eatACake()
    cakesEaten ++
  }

  do {
    bakeACake()
    cakesBaked++
  } while (cakesBaked < cakesEaten)
}