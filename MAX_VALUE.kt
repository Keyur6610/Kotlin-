fun main() {

    var arr = arrayOf(80,20,60,40,10,30,100,50,70,90)
    var max = arr[0]
    for(i in 0..arr.size-1){
      
      if(arr[i]>max){
         max = arr[i]
      }
      
    }
    println("Max Value: $max")
   
}