fun main(args: Array<String>) {
    
    println("----------Pizza Offer---------\n")                    
   
    println("Order 4 Small Pizza 1 Coke Free")
    println("Order 3 Medium Pizza 2 Coke Free")
    println("Order 2 Large Pizza 3 Coke Free")
    println("Order 1 Monster Pizza Icecream Free\n")
    
    println("Enter 1 For Small Pizza")
    println("Enter 2 For Medium Pizza")
    println("Enter 3 For Large Pizza")
    println("Enter 4 For Monster Pizza\n")
    
    print("Enter Choice: ")
    var choice=Integer.valueOf(readLine())
    
    println("Your Choice: $choice")
    
    if(choice == 1){
    
       smallPizza()
        
    }
    
    else if(choice==2){
      
       mediumPizza()
      
    }
    
    else if(choice==3){
      
       largePizza()
      
    }
    
    else if(choice==4){
      
       monsterPizza()
      
    }
    
    else{
    
        println("\nInValid Choice..!!")
    }
   
    
}

fun smallPizza(){
    
    do{
    
    print("\nEnter Pizza Quantity: ")
    var q=Integer.valueOf(readLine())
    
    println("Your Pizza Quantity: $q")
    
    if(q == 4){
        println("\nOrder Confirmed 4 Small Pizza with 1 Coke Free")
    }
    else
    {
        println("\nInvalid Quantity..!!")
    }
    
    }while(q!=4)
    
}

fun mediumPizza(){
    
    do{
    
    print("\nEnter Pizza Quantity: ")
    var q=Integer.valueOf(readLine())
    
    println("Your Pizza Quantity: $q")
    
    if(q == 3){
        println("\nOrder Confirmed 3 Medium Pizza with 2 Coke Fre")
    }
    else
    {
        println("\nInvalid Quantity..!!")
    }
    
    }while(q!=3)
    
}

fun largePizza(){
    
    do{
    
    print("\nEnter Pizza Quantity: ")
    var q=Integer.valueOf(readLine())
    
    println("Your Pizza Quantity: $q")
    
    if(q == 2){
        println("\n Order Confirmed 2 Large Pizza with 3 Coke Free")
    }
    else
    {
        println("\nInvalid Quantity..!!")
    }
    
    }while(q!=2)
    
}

fun monsterPizza(){
    
    do{
    
    print("\nEnter Pizza Quantity: ")
    var q=Integer.valueOf(readLine())
    
    println("Your Pizza Quantity: $q")
    
    if(q == 1){
        println("\nOrder Confirmed 1 Monster Pizza with Icecream Free")
    }
    else
    {
        println("\nInvalid Quantity..!!")
    }
    
    }while(q!=1)
    
}



    
    
    
