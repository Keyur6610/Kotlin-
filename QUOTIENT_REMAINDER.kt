fun main(){
    
    println("Enter Dividend: ")
    var Dividend = Integer.valueOf(readLine())
    println("Enter Divisor: ")
    var Divisor = Integer.valueOf(readLine())
    
    var quotient = Dividend/Divisor
    var remainder = Dividend % Divisor
    
    println("Quotient is: $quotient")
    println("Remainder is: $remainder")
}
