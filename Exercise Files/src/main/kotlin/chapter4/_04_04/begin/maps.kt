package chapter4._04_04.begin

fun main() {
    val m1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val m2 = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")

    println("m1 == m2? ${m1 == m2}")

    println()
    println("m1[6] = ${m1.getOrDefault(6, "not present")}")
}

