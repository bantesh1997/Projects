def bubbleSort(list: List[Int]): List[Int] ={
  val copy_list= new Array[Int](5)
  for(i<- 0 until list.length)
  {
    copy_list(i)=list(i)
  }
  list.foreach(i2=> println(i2))
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

val list = List(1,4,3,5,-2)
bubbleSort(list)