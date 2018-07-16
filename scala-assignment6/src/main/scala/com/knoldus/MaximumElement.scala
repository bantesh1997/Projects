package com.knoldus

class MaximumElements {

  def maximumElements(list:List[Int]):List[Int]={


    if(list.size<5) {
      throw new ArrayIndexOutOfBoundsException
    }

 else{
      val elementBetweenRange=list.filter(element=>element>=9&&element<=18)

      if(elementBetweenRange.size<5) {
        throw new ArrayIndexOutOfBoundsException
      }
      else{
        val reverseRange= elementBetweenRange.sorted.reverse
        reverseRange.take(5).map(_ * 5)
      }

    }

  }

}
