fun main() {

    var obj = A()
    obj.demo(20,30)
    
}

open class A
{
  
    fun demo(){
        println("call Function 1")
    } 
    
    fun demo(a:Int){
        println("call Function 2: $a")
    }
    
    fun demo(a:Int,b:Int){
        println("call Function 3: $a $b")
    }

  
  }



