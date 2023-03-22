fun main() {

    var obj = A()
    try{
        obj.Demo()
    }
    
    catch(e: ArithmeticException){
        println("denominator cannot be zero")
    }
    
    catch(e: NumberFormatException){
        println("denominator should be integer value")
    }
    
    catch(e: Exception ){
        println("Error")
    }
    
    finally {
        println("this should be execute everytime")
    }
    
}

class A 
{
    
    fun Demo(){
        println("Enter The Value Of a: ")
        var a = Integer.valueOf(readLine())
        
        println("Enter The Value Of b: ")
        var b = Integer.valueOf(readLine())
        
        var c = a/b
        println("Division is: $c")
    }
    
}