object question3 {

  def main(args: Array[String]) = {

    val n = scala.io.StdIn.readInt()
    
    var m :BigInt = 1
    
    var sum:BigInt = 0
    
    for (i <- 1 to n) {
    
     m = m * i
   
     }
    
   while (m > 0) {
   
      sum = sum + m % 10
   
      m = m / 10
   
     }

    println(sum)
  
   }

 }

