package chapter3._03_04.begin

fun main() {

    val students = listOf("Janet", "Daisy", "Veronica", "Fernanda")
    for (student in students){
        println("Current Student is $student")
    }

    for ((index, student) in students.withIndex()){
        println("Student  #${index + 1} is $student")
    }

}
