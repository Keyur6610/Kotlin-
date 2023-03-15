fun main(){
  
  var obj = B()
  obj.demo()
  obj.get()  
}

open class A ()
{
   var a = 10
    fun demo(){
        println("Call A")
    }
}

class B : A()
{
    fun get(){
        println("Value Of a: $a")
    }
}
