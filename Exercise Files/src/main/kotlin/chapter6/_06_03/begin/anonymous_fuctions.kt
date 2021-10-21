package chapter6._06_03.begin

fun main() {
    val num = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

    val fNum = num.filter(fun(a: Int): Boolean {return  a < 7})
}
