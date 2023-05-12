package oop

// Companion Objects.

class BigBen {
  companion object Bonger {
    fun getBongs(nTimes: Int) {
      for (i in 1 .. nTimes) {
        print("BONG ")
      }
    }
  }
}

fun main() {
  BigBen.getBongs(12)
}