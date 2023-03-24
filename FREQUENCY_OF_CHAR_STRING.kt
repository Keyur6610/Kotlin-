fun main() {

    var s = "This Website is Awesome"
    var ch = 'e'
    var Frequency = 0
    
    for(i in 0..s.length-1){
        
        if(s[i] == ch){
            Frequency++
        }
        
    }
    
    println("Frequency Of $ch: $Frequency")
}