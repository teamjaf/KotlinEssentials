package chapter3._03_01.begin

fun returnsNothing() {
    println("returnsNothing() function")
}

fun main() {
    val bigger = 1000
    val smaller = 1


    val max = if (bigger > smaller ) bigger else smaller

    val age = 43

    val boardGroup = when (age){
        in 0..18 -> "family"
        else -> "regular"
    }
}
