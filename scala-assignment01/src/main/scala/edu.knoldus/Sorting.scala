package edu.knoldus

class Sorting {
  def insertionSort(list: List[Int]): List[Int] ={

    val copy_list = new Array[Int](list.size)

    for (i <- 0 until list.length){
      copy_list(i) = list(i)
    }
    var j: Int = 0
    for(i <-0 until copy_list.size )
    {
      val key = copy_list(i)
      j = i-1
      while (j >= 0 && list(j) > key)
      {
        val swap = copy_list(j)
        copy_list(j+1) = swap
        j = j-1
      }
      copy_list(j+1) = key
    }
    copy_list.toList
  }

  def selectionSort(list: List[Int]): List[Int] ={
    val copy_list = list.toArray[Int]

    for(i<- 0 until list.length)
    {
      copy_list(i) = list(i)
    }
    //list.foreach(i2=> println(i2))
    for (i <- 0 until (copy_list.length -1))
    {
      var min = i
      //find min
      for(j <- (i+1) until copy_list.length)
      {
        if (copy_list(j) < copy_list(min))
          min = j
      }

      if (i != min)
      {
        val swap = copy_list(i)
        copy_list(i) = copy_list(min)
        copy_list(min) = swap
      }
    }
    copy_list.toList

  }

  def bubbleSort(list: List[Int]): List[Int] ={
    val copy_list= new Array[Int](5)
    for(i<- 0 until list.length)
    {
      copy_list(i)=list(i)
    }
   // list.foreach(i2=> println(i2))
    for (i <- 0 until (copy_list.length -1)) {
      for (j <- 0 until copy_list.length-i-1) {
        if (copy_list(j) > copy_list(j+1)) {
          val swap = copy_list(j)
          copy_list(j) = copy_list(j+1)
          copy_list(j+1) = swap
        }
      }
    }
    copy_list.toList
  }

}
