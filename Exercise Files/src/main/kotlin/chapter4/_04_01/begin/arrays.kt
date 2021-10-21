package chapter4._04_01.begin

data class Student(val firstName: String, val grade: Int)

fun main() {
    val things = arrayOf(1,2,3,4,"Jafrin","player",3.3)
    things[0] = "zero"

    for (thing in things){
        print(thing)
    }

    val students = arrayOf<Student>(Student ("Todd", 45))

    val fives = Array(50, ::fiver)
    fives.forEach { println(it) }
}

//this is very important
//it is array constructor
fun fiver(index: Int): Int{
    return index * 5;
}

