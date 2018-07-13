package com.knoldus

class Fibbonacci {
  def fiboSeries(num: Int): List[Int] = {

    if (num <= 0) {
      throw new ArithmeticException()
    }
    else if (num == 1) {
      List(0)
    }

    else if (num == 2) {
      List(0, 1)
    }

    else {

      val arr = new Array[Int](num)

      arr(0) = 0
      arr(1) = 1

      // @tailrec
      def fibo(first: Int, second: Int, iterator: Int): Unit = {

        if (iterator == num - 3) {
          //println(first + second)
          arr(iterator + 2) = first + second

        }
        else {
          //println(first + second)
          val index = iterator + 2
          arr(index) = first + second
          fibo(second, first + second, iterator + 1)
        }
      }

      fibo(0, 1, 0)
      arr.toList
    }

  }
}
