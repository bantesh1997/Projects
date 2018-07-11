def selectionSort(list: List[Int]): List[Int] ={
  val copy_list= new Array[Int](5)
   for(i<- 0 until list.length)
     {
       copy_list(i)=list(i)
     }
  list.foreach(i2=> println(i2))
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

val list = List(1,4,3,5,-2)
selectionSort(list)