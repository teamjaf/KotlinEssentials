package chapter7._07_01.begin

public class PlainShort{
}

class ShortClass

class WithConstructor constructor(name:String, age: Int){

}


class WithoutConstructor (name:String, age: Int){

}

class Mandatory internal constructor(age:Int){

}

class CourseProperty(courseTitle: String){
    val title = courseTitle
}


class Course(courseTitle: String,  lastName: String){
    private val title = courseTitle
    internal var description = ""
    get(){
        return "Okays"
    }

}


fun main() {
}
