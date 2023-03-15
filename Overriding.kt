fun main(){

    println("hello world")
    var obj = B()
    obj.demo()
}

open class A {
    
   open fun demo(){
        println("call A")
        
    }
    
    
}

class B : A()
{

   override fun demo(){
        println("call B")
        super.demo()
    }
    
}

