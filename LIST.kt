fun main() {

    var list = listOf(1,2,3,4,6.67,"Android")
    println(list)
    print("\n")

    var list1 = mutableListOf(1,2,"kotlin",81.66,"Java")
    println(list1)
    
    list1.add(3)
    println(list1)
    list1.remove("Java")
    println(list1)
    print("\n")
    
    var list2 = mutableListOf(4,5,7.6,"Hello")
    println(list2)
    list2.addAll(list)
    println(list2)
    
    print("\n")
    for(i in 0..list2.size-1){
        println(list2[i])
    }
    


}