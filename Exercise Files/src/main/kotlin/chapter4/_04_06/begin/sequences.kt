package chapter4._04_06.begin

fun main() {
    val result = (100 until 200).asSequence()
        .map { println("doubling $it"); it * 2 }
        .filter { println("filtering $it"); it % 3 == 0 }
        .first()
    println("results = $result")
    println()

    println()

    val myThrees = sequenceOf(1, 2, 3, 4, 5, 43, 3 ).filter { it % 3 == 0 }
}
