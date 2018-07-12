object fibbonaci {

 def fibbonacci(numberOfIteraion: Int): Unit = {

      def fibb(x: Int, y: Int, i: Int): Unit = {

      @tailrec

        if (i == numberOfIteraion - 1) {

          println(x)

        }
        else {

          println(x)

          fibb(y, x + y, i + 1)
 
        }

      }
  
      fibb(0, 1, 0) 

      }

  def main(args: Array[String]) = {

  val numberOfIteraion = scala.io.StdIn.readInt()
  
   fibbonacci(numberOfIteraion)
  
 }

}
