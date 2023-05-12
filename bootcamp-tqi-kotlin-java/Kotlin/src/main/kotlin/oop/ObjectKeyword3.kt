package oop

// [object] Declaration.

object DoAuth {
  fun takeParams(username: String, password: String) {
    println("input Auth parameters = $username:$password")
  }
}

fun main(){
  DoAuth.takeParams("foo", "qwerty")
}