fun main() {

    var obj1 = Student("Kotlin",1,81.66)
    var obj2 = Student("Kotlin",1,81.66)
    
    println(obj1)
    println(obj2)
    
    println(obj1 == obj2)
}

data class Student(var Name:String,var rollNum:Int,var Per:Double) 
{
   
   
}

