fun main() {
   
    var s = SBI()
    s.interest()
    s.loan()
    var h = HDFC()
    h.interest()
    h.loan()
}


abstract class RBI
{
   abstract fun interest()
   abstract fun loan()
}

class SBI: RBI()
{
    override fun interest(){
        println("SBI Interest : 6%")
    }
    
    override fun loan(){
        println("SBI Loan : 8%")
    }
}

class HDFC : RBI()
{
    override fun interest(){
        println("HDFC Interest : 7%")
    }
    
    override fun loan(){
        println("HDFC Loan : 10%")
    }
}



