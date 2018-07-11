object question3 {

  def main(args: Array[String]) = {

    //   val n = scala.io.StdIn.readInt()


    def fibbonacci(n: Int): Unit = {
      def fibb(x: Int, y: Int, i: Int): Unit = {
        if (i == n - 1) {
          println(x)
        }
        else {
          println(x)
          fibb(y, x + y, i + 1)
        }
      }

      fibb(0, 1, 0)

    }

    fibbonacci(7)
  }
}