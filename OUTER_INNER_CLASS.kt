fun main() {
   /* var o = Outer()
    o.out()
    var i = Outer.Inner()
    i.inr() */
   
   var i = Outer().Inner()
   i.inr()
   
}


class Outer
{ 
   var a = 10
   var b = 20

   fun out(){
   
       println("a = $a")
       
   }
   
   inner class Inner
    {
    
     fun inr(){
     
         println("b = $b")
         
     }
       
    }
}