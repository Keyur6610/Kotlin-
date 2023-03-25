fun main() {

    var map = mapOf<Int,String>(1 to "Kotlin",2 to "Java",3 to "Android",4 to "Kotlin")
    println(map)
    
    println(map.get(2))
    println(map.getValue(3))
    println(map.containsKey(1))
    println(map.containsValue("Android"))
    println(map.keys)
    println(map.values)
    
    for(i in 1..map.size){
        println(map[i])
    }
    
    println("\n-------------Mutable Map------------\n")
    
    var map2 = mutableMapOf<Int,String>(1 to "Kotlin",2 to "Java",3 to "Android")
    map2.put(4,"Hello")
    println(map2)
    
    map2.remove(4)
    println(map2)
    
    println(map2.get(1))
    println(map2.getValue(2))
    println(map2.containsKey(3))
    println(map2.containsValue("Hello"))
    
}