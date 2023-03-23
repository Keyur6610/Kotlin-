fun main() {

    println("Enter Factorial: ")
    var F:Int = Integer.valueOf(readLine())
    var Fact = 1
    
    for(i in 1..F){
        Fact = Fact*i
    }
    
    println("Factorial Of $F: $Fact")
    
}

