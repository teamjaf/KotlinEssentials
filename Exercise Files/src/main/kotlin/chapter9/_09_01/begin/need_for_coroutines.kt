package chapter9._09_01.begin

import chapter9._09_01.end.synchronous
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        asyncAwit()
        println()
     
    }
    println("$time ms")
}

suspend fun longCalc(startNum: Int): Int {
    delay(1000)
    return startNum + 1
}

fun sysnchronous() = runBlocking {
    val x1 = longCalc(13333)
    val x2 = longCalc(13333)
    val x3 = longCalc(13333)

    val sum = listOf(x1,x2, x3)

    println(sum)

}

fun asyncAwit() = runBlocking {
    val x1 = async {  longCalc(13333) }
    val x2 = async {  longCalc(13333) }
    val x3 = async {  longCalc(13333) }
    val sum = listOf(x1,x2, x3).awaitAll().sum()

    println(sum)

}
