package chapter4._04_03.begin

fun main() {
    val threes = setOf(2, 2,2,2,2)
    println(threes)
    println("Size = ${threes.size}")
    println("has  45 ${threes.contains(45)}")

    println()

    val fset = hashSetOf(1, 2, 3, 4, 5)
    val bset = hashSetOf(5, 4, 3, 2, 1)
    println()
    println("fset == bset ? ${fset == bset}")

    val alist = fset.toList()

    println(fset)


}
